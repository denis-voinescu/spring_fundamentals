package beans_example3;

import beans_example3.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

    }
}
