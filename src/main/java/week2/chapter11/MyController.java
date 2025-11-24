package week2.chapter11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    private RestTemplate restTemplate;

    public MyController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String JOKE_API = "https://official-joke-api.appspot.com/random_joke";

    @GetMapping("/joke")
    public String getJoke() {
        return restTemplate.getForObject(JOKE_API, String.class);
    }
}
