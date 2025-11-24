package week2.chapter9.application_scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@ApplicationScope
public class Counter {

    // A simple counter to demonstrate session scope
    // The value will always be incremented when a request is made
    // across the application
    // no matter if the there is a new session for example
    // basically it will be shared for all users

    public int count = 0;

    public int incrementAndGet() {
        return ++count;
    }
}
