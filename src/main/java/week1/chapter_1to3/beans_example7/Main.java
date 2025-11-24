package week1.chapter_1to3.beans_example7;

import week1.chapter_1to3.beans_example7.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var parrot1 = context.getBean("parrot1");
        var parrot2 = context.getBean("parrot2");
        var person1 = context.getBean("person");



        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
    }
}
