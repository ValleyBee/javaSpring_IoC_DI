package spring_introduction;

public class Hamster implements Pet{

    public Hamster(){
        System.out.println("Hamster bean is created");
    }
    @Override
    public void say()    {
            System.out.println("hamster is silent....");
        }
    }



