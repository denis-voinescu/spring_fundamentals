package week2.chapter8.request_parameters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name){
        return "Hello " + name;
    }
}
