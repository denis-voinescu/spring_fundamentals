package week1.chapter_1to3.beans_example7.config;

import week1.chapter_1to3.beans_example7.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans_example7")
public class AppConfig {

    @Bean
    Parrot parrot1(){
        System.out.println("Parrot 1 bean initialized");
        Parrot p = new Parrot();
        p.setName("Parrot 1");
        return p;
    }

    @Bean
    Parrot parrot2(){
        System.out.println("Parrot 2 bean initialized");
        Parrot p = new Parrot();
        p.setName("Parrot 2");
        return p;
    }
}
