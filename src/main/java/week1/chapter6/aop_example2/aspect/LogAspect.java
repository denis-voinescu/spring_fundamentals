package week1.chapter6.aop_example2.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("execution(void doSomething())")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before execution");
        joinPoint.proceed();
        System.out.println("After execution");
    }

}
