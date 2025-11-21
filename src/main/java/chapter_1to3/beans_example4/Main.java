package chapter_1to3.beans_example4;

import chapter_1to3.beans_example4.config.AppConfig;
import chapter_1to3.beans_example4.model.Parrot;
import chapter_1to3.beans_example4.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        var person = (Person) context.getBean("person");

        var parrot = (Parrot) context.getBean("parrot");

        System.out.println(person.getName());
        System.out.println(parrot.getName());

        System.out.println(person.getParrot().getName());

    }
}
