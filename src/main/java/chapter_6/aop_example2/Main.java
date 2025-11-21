package chapter_6.aop_example2;

import chapter_6.aop_example2.config.AppConfig;
import chapter_6.aop_example2.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var service = context.getBean(Service.class);

        service.doSomething();

    }
}
