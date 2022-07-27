// DI Example I Configuration by annotation in Class ConfigAnnotation instead of XML file
// DI Example II Configuration by @Bean annotation in Class ConfigBean instead of XML file
package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test6 {
    public static void main(String[] args) {
        // DI Example I
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAnnotation.class);

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
        context.close();
        System.out.println("__________________");

        // DI Example II
         AnnotationConfigApplicationContext contextBean = new AnnotationConfigApplicationContext(ConfigBean.class);

         Pet pet = contextBean.getBean("hamsterBean",Hamster.class);
         pet.say();
       // System.out.println("__________________");
        // DI Example III

        Person2 person2 = contextBean.getBean("person2Bean",Person2.class);
        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());

        person2.callYourPet();

        contextBean.close();






    }
}
