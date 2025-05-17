package SingleInheritence;

public class Parent {

    String eyes ;

    String skin_colour ;

    String height ;


    Parent(){

        System.out.println( " I'm Calling from Parent Class ! ");

        eyes = "brown";

        skin_colour = "white";

        height = "5.5ft";
    }

    public static void main(String[] args) {

        Parent parent = new Parent();


    }
}


