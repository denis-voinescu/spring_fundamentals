package chapter_1to3.beans_example4.config;

import chapter_1to3.beans_example4.model.Parrot;
import chapter_1to3.beans_example4.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("myParrot");
        return p;
    }

    // Two variants to link the two beans (Person and Parrot - Person HAS A Parrot):


    // 1:
    @Bean
    Person person(){
        Person person = new Person();
        Parrot parrot = parrot(); // returns the same object as the parrot bean above
        person.setName("myPerson");
        person.setParrot(parrot);
        return person;
    }

    // 2:

//    @Bean
//    Person person(Parrot parrot){
//        Person person = new Person();
//        person.setName("myPerson");
//        person.setParrot(parrot);
//        return person;
//    }

}
