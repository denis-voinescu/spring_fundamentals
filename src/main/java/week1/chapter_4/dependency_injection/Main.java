package week1.chapter_4.dependency_injection;

import week1.chapter_4.dependency_injection.config.AppConfig;
import week1.chapter_4.dependency_injection.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        var service = context.getBean(CommentService.class);

        service.storeComment();
        
    }

}
