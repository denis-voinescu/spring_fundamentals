package week1.chapter6.aop_example2;

import week1.chapter6.aop_example2.config.AppConfig;
import week1.chapter6.aop_example2.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var service = context.getBean(Service.class);

        service.doSomething();

    }
}
