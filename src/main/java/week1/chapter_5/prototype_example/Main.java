package week1.chapter_5.prototype_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import week1.chapter_5.prototype_example.config.AppConfig;
import week1.chapter_5.prototype_example.service.CommentService;

public class Main {

    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        var a = context.getBean(CommentService.class);
        var b = context.getBean(CommentService.class);

        System.out.println(a==b); // false because a new bean is requested each time, due to prototype scope

        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
