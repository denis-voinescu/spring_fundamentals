package week2.chapter10;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String greet(String name) {

        if(name.equals("Denis"))
            throw new InvalidNameException();

        return "Hello, " + name + "!";
    }
}
