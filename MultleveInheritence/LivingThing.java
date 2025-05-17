package MultleveInheritence;

public class LivingThing {
    String Legs ;

    String Hands ;

    String Eyes ;

    LivingThing(){
        System.out.println("Every Breathing thing is Living ");
        Legs = "2";
        Hands = "2" ;
        Eyes = "2";
    }

    public void displayDetails(){
        System.out.println("Number of legs of any LivingThing  is : "+Legs+" Number of Hands of Any LivingThing  is : "+Hands+" and Number of eyes of any LivingThing is : "+Eyes);
    }

    public static void main(String[] args) {

        LivingThing lt = new LivingThing();

        lt.displayDetails();
    }
}
