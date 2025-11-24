package week1.chapter_6.aop_example2.service;

@org.springframework.stereotype.Service
public class Service {

    public void doSomething() {
        System.out.println("Doing something");
        throw new RuntimeException("Something went wrong");

    }
}
