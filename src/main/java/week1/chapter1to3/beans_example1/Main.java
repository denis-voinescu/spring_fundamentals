package week1.chapter1to3.beans_example1;
import week1.chapter1to3.beans_example1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}