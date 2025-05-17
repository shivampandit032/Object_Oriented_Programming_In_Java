package MultleveInheritence;

public class Amphibians extends LivingThing{

    String inhabit ;

    String food ;


    Amphibians(){

        // super() ;

        System.out.println("Every Living thing living in either land and water is Amphibian ");

        inhabit = " Both in water and land";

        food = "Both Herbivorus and Carnivorus" ;
    }

    public static void main(String[] args) {

        Amphibians amphi = new Amphibians();

    }
}
