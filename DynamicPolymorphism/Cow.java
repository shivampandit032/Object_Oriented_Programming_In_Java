package DynamicPolymorphism;

public class Cow extends LivingThing{
    @Override

    public void displayDetails(){
        this.Legs = "4";

        this.Hands = "Cow Doesn't Hand" ;

        this.Eyes = "2" ;

        System.out.println("The Number of Legs of Any Cow is : "+Legs+" The Number of Hands any Cow is : "+Hands+ " and Number of Eyes of Any Cow is : "+Eyes);
    }
    public static void main(String[] args) {

        Cow cow = new Cow();

        cow.displayDetails();
    }
}
