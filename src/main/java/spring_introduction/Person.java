// @Autowired @Qualifier("dog")  use when more one @Component marked
// DI - Autowire by injection to main code of constructor,setter(any methods),field
// @Value
package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("cat")
    private Pet pet;
    //@Value("${person.surname}")  // use properties file
    private String surname;
    //@Value("${person.age}")  // use properties file
    private int age;


    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: setter pet");
        this.pet = pet;
    }

    // SETTERS
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // GETTERS
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;

    }

    public Person() {
        System.out.println("Person bean is created: Default constructor");
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }

}
