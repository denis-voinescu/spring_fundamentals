package chapter_5.prototype_example2;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Processor {

    public void process(){
        System.out.println("Processor -> process called.");
    }
}
