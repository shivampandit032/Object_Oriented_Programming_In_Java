package StaticPolymorphism;

public class Human {
    String hairColour ;

    String eyesColour ;

    // this is One of the example of " Static Polymorphism " or " Run Time Polymorphism " .

    Human(){
        // By default features of any " Amphibians "

        eyesColour = "brown";

        hairColour = "Black";

    }

    Human(String hair , String eyes){

        hairColour = hair ;

        eyesColour = eyes ;
    }

    void DetailsOfHuman(){

        System.out.println(" Hair Colour of Amphibians is : "+hairColour+" and "+" eyes Colour of Amphibians is : "+eyesColour);
    }


    void DetailsOfHuman(String hair , String eyes){
        this.hairColour = hair ;

        this.eyesColour = eyes ;

        System.out.println(" Hair Colour of Specifically is this Amphibians object is "+hairColour+ " and "+" Eyes colour of this Amphibians object is : "+eyesColour);
    }


    public static void main(String[] args) {
        Human human = new Human();

        Human human1 = new Human("Blonde" , "Red");

        human.DetailsOfHuman();

        human1.DetailsOfHuman("Rainbow" , "Green");
    }
}
