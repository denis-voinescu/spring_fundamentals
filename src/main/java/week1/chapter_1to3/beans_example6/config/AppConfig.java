package week1.chapter_1to3.beans_example6.config;

import week1.chapter_1to3.beans_example6.model.Parrot;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    // because of this annotation, on greeting bean initialization, parrot1 will be used
    // because parrot1 and parrot2 have the same type
    // but if I commend the annotation, parrot2 will be used because the parameter name matches parrot2
    @Primary
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Parrot 1");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Parrot 2");
        return p;
    }
    @Bean
    String greeting(@Qualifier("parrot1") Parrot parrot2){
        return "Hello "+parrot2.getName()+"!";
    }
    // @Qualifier will inject the bean that matches the name and it has priority over the parameter name
    // which is parrot2, but we qualified it as parrot1
}
