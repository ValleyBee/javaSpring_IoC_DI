// Creating Objects by Spring constructor XML
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext apContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        /* Dependency injection by constructor in xml
            Pet pet = apContext.getBean("myPet2",Pet.class);  // Pet pet = new Dog();
        */


        Person person = apContext.getBean("myPerson", Person.class); // Person person = new Person(pet);
        person.callYourPet();
        System.out.println(person.getSurname() +" : "+ person.getAge());



        apContext.close();



    }
}
