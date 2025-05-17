package SingleTonClassInJava;

public class SingletonClass {

    String name ;

    int age ;
    public static SingletonClass obj = null ;

    private SingletonClass(){
        age = 24 ;
        name = "Shivam";

    }

     private static SingletonClass getObj(){

        if( obj == null){
            obj = new SingletonClass();

        }
        return obj ;
    }

    public static void main(String[] args) {

        SingletonClass ob1 = SingletonClass.getObj();

        SingletonClass ob2 = SingletonClass.getObj();

        SingletonClass ob3 = SingletonClass.getObj();

        System.out.println(ob1.name+" "+ob1.age);

        System.out.println(ob2.name+" "+ob2.age);


        System.out.println(ob3.name+" "+ob3.age);

        if((ob1.hashCode() == ob2.hashCode())&& (ob2.hashCode() == ob3.hashCode())){
            System.out.println("Last 2 Objects are reffering to same object ");
        }
        else{
            System.out.println("All three are different objects ");
        }
    }
}
