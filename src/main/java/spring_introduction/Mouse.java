package spring_introduction;

public class Mouse implements Pet{

    public Mouse(){
        System.out.println("Mouse bean is created");
    }

    @Override
    public void say(){
        System.out.println("mouse is silent....");
    }
    public void init(){
        System.out.println("Class Mouse: init method");
    }
    public void destroy(){
        System.out.println("Class Mouse: destroy method");
    }
}
