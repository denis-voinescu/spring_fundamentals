package chapter_6.aop_example2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aop.example2")
@EnableAspectJAutoProxy
public class AppConfig {
}
