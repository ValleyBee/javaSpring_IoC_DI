package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component
@Scope("prototype")

public class Mouse implements Pet{

    public Mouse(){
        System.out.println("Mouse bean is created");
    }

    @Override
    public void say(){
        System.out.println("mouse is silent....");
    }

    @PostConstruct // deprecated from java 11 need download Lib  file javax.annotation-api-1.3.2.jar
    public void init(){
        System.out.println("Class Mouse: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Mouse: destroy method");
    }
}
