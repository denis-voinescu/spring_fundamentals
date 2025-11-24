package week2.chapter9.application_scope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final Counter counter;

    public MyController(Counter counter) {
        this.counter = counter;
    }

    @GetMapping("/counter")
    public String getCounter() {
        int currentCount = counter.incrementAndGet();
        return "Current count for this application: " + currentCount;
    }

}
