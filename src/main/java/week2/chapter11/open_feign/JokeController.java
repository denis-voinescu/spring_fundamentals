package week2.chapter11.open_feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    private final JokeClient jokeClient;

    public JokeController(JokeClient jokeClient) {
        this.jokeClient = jokeClient;
    }

    @GetMapping("/joke")
    public String getJoke() {
        return jokeClient.getRandomJoke();
    }
}

