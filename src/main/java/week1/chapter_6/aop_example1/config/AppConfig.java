package week1.chapter_6.aop_example1.config;

import week1.chapter_6.aop_example1.aspect.Helper;
import week1.chapter_6.aop_example1.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    Service service(){
        return new Service();
    }

    @Bean
    Helper helper(){
        return new Helper();
    }
}
