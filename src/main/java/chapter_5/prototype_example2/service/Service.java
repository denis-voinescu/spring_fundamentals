package chapter_5.prototype_example2.service;

import chapter_5.prototype_example2.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private ApplicationContext applicationContext;

//    @Autowired
//    private Processor processor;  -- this will inject the Processor dependency in the Service bean, which will be the same for all service bean instances, despite processor being a prototype

    public void process(){

        Processor processor = (Processor) applicationContext.getBean("processor"); // this will create a new processor instance each time it's needed because Processor is not injected in Service
        processor.process();
        System.out.println(processor);
    }
}
