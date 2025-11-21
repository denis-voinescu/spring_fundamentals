package chapter_1to3.beans_example2;
import chapter_1to3.beans_example2.config.AppConfig;
import chapter_1to3.beans_example2.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    void main(){

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        Parrot parrot = new Parrot();
        parrot.setName("myParrot");
        Supplier<Parrot> parrotSupplier = () -> parrot;

        context.registerBean("myParrot", Parrot.class, parrotSupplier);

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

    }
}
