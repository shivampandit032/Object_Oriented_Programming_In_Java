package MultipleInheritance;

public class Main {

    public static void main(String[] args) {

        Me me = new Me();

        me.child();

        System.out.println("My Father's Age is : "+Father.age);

        System.out.println(" My Mother age is : "+Mother.age);
    }
}
