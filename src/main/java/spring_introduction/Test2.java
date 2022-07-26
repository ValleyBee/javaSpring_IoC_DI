// Creating Objects by Spring constructor XML
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext apContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = apContext.getBean("myPet",Pet.class);
        pet.say();
        pet = apContext.getBean("myPet2",Pet.class);
        pet.say();
        apContext.close();

    }
}
