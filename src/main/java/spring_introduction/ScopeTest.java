package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        //
        Mouse myMouse = context.getBean("mouse",Mouse.class);
        Mouse yourMouse = context.getBean("mouse",Mouse.class);
        myMouse.say();
        yourMouse.say();
        System.out.println("are variables ref to same object? " + myMouse.equals(yourMouse)); // true if @Scope("singleton") in Class
        System.out.println("__________________");


        context.close();

    }
}
