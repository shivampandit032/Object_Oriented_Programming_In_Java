package MultipleInheritance;

class Me implements Father , Mother {

    @Override

    public void child(){

        System.out.println(" I'm children from both Father and Mother Parents !");
    }
}
