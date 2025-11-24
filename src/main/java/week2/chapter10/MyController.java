package week2.chapter10;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/greet")
    public ResponseEntity<String> greet(@RequestParam String name) {
        String message = myService.greet(name);
        return ResponseEntity.ok(message);
    }
}
