package week1.chapter_1to3.beans_example5;

import week1.chapter_1to3.beans_example5.config.AppConfig;
import week1.chapter_1to3.beans_example5.model.Parrot;
import week1.chapter_1to3.beans_example5.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        parrot.setName("Koko");

        System.out.println(person.getName());
        System.out.println(parrot.getName());
        System.out.println(person.getParrot().getName());


        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

    }
}
