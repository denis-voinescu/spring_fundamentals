package week1.chapter4.dependency_injection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "chapter4_dep_inj")
public class AppConfig {
}
