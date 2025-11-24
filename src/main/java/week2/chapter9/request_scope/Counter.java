package week2.chapter9.request_scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Counter {

    // A simple counter to demonstrate request scope
    // It will be reset for each HTTP request
    // The value should always be 1 for each new request

    public int count = 0;

    int incrementAndGet() {
        return ++count;
    }
}
