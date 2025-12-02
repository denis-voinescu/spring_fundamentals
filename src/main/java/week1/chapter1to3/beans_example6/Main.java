package week1.chapter1to3.beans_example6;

import week1.chapter1to3.beans_example6.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        String greeting = context.getBean("greeting",String.class);
        System.out.println(greeting);
    }

}
