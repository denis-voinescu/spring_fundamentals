package chapter_6.aop_example1.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Helper {

    @Before("execution(public void printSomething())")
    public void printSomethingFromHelperBefore(){
        System.out.println("Printing something from Helper (before)");
    }

    @After("execution(public void printSomething())")
    public void printSomethingFromHelperAfter(){
        System.out.println("Printing something from Helper (after)");
    }
}
