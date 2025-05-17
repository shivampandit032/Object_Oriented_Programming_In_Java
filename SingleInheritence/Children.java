package SingleInheritence;

public class Children extends Parent{

    String voice ;

    String smartness ;

    Children(){

        super();

        voice = "Louder than Parent ";

        smartness = " Smarter than Parent ";

        System.out.println( " I'm Calling from Children Class ! ");

    }

    public static void main(String[] args) {

        // Here , At the time of creating " Child class object " , First " parent class constructor will be call and then Child class Constructor will be call "

        // Parent parent = new Parent();

        Children child = new Children();

        System.out.println(" Eyes colour of Parent is : "+child.eyes);

        System.out.println(" Skin colour of Parent is : "+child.skin_colour);

        System.out.println(" height of Parent is : "+ child.height);

        Parent human = new Children();  // Children's Object will be created


    }
}
