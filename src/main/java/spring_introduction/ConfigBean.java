// Example II Configuration by @Bean
package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class ConfigBean {
@Bean
@Scope("singleton")
    public Pet hamsterBean(){   // bean id is name of method
        return new Hamster();
     }

     @Bean
     public Person2 person2Bean(){
    return new Person2(hamsterBean());
     }
}
