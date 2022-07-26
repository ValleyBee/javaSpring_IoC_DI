package spring_introduction;

import org.springframework.stereotype.Component;

 // @Component("catBean") // id bean = "catBean"
 @Component // id bean will be created auto with name of Class cat
public class Cat implements Pet{
    private String name;
    public Cat(){
        System.out.println("Cat bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
