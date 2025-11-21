package chapter_4.dependency_injection;

import chapter_4.dependency_injection.config.AppConfig;
import chapter_4.dependency_injection.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        var service = context.getBean(CommentService.class);

        service.storeComment();
        
    }

}
