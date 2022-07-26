// Creating Objects by Spring constructor XML
// SCOPE of bean
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_test4.xml");


        // SCOPE singleton bean. for stateless objects
        // constructor of class be created without getBean()

        Dog myDog = context.getBean("myPet",Dog.class);
        Dog yourDog = context.getBean("myPet",Dog.class);
        System.out.println("are variables ref to same object? " + myDog.equals(yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        myDog.setName("nonamedog");
        yourDog.setName("Underdog");
        System.out.println(myDog.getName()); // out Underdog
        System.out.println(yourDog.getName()); // out Underdog
        System.out.println("__________________");

        // SCOPE prototype bean.for stateful Objects
        // constructor of class be created only by getBean()
        Cat myCat = context.getBean("myPet2",Cat.class);
        Cat yourCat = context.getBean("myPet2",Cat.class);
        System.out.println("are variables ref to same object? " + myCat.equals(yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);

        myCat.setName("no-one.kitty");
        yourCat.setName("furry.kitty");
        System.out.println(myCat.getName()); // out noone.kitty
        System.out.println(yourCat.getName());// out furry.kitty
        System.out.println("__________________");

        // init-method destroy method

        Mouse myMouse = context.getBean("myPet3",Mouse.class);
        Mouse yourMouse = context.getBean("myPet3",Mouse.class);
        myMouse.say();

        context.close();




    }
}
