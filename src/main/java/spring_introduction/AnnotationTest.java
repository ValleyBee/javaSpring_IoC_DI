// Creating Objects by Spring annotation XML applicationContext_annotation.xml
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        // Cat myCat = context.getBean("catBean", Cat.class); // id in case we want

        Cat myCat = context.getBean("cat", Cat.class); //  id for auto creating
        myCat.say();

        context.close();

    }
}
