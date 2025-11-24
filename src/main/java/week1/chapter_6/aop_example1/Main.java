package week1.chapter_6.aop_example1;

import week1.chapter_6.aop_example1.config.AppConfig;
import week1.chapter_6.aop_example1.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var service = context.getBean(Service.class);
        
        for(String beanName: context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        service.printSomething();
    }
}
