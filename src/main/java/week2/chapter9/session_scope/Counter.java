package week2.chapter9.session_scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Counter {

    // A simple counter to demonstrate session scope
    // The value will always be incremented on each request

    public int count = 0;

    public int incrementAndGet() {
        return ++count;
    }
}
