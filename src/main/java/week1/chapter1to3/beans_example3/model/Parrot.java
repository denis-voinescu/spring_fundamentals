package week1.chapter1to3.beans_example3.model;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
