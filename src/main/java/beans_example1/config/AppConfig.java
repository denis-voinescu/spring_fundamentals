package beans_example1.config;

import beans_example1.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Parrot parrot(){
        return new Parrot();
    }
}
