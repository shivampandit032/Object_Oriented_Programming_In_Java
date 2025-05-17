package MultleveInheritence;

public class Human extends Amphibians{

    String breath ;

    String intelligence ;

    Human(){

        super();

        System.out.println("Most Evolved Living Thing in this Planet ");

        breath = "Oxygen";

        intelligence = "Most Intelligent than any other Living Thing ";


    }
    public static void main(String[] args) {

        Human human = new Human();

    }
}
