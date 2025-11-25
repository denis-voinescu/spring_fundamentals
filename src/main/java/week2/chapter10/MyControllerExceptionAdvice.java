package week2.chapter10;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerExceptionAdvice {

    @ExceptionHandler(InvalidNameException.class)
    public ResponseEntity<ErrorDetails> handleInvalidNameException(){
        ErrorDetails errorDetails = new ErrorDetails("Invalid name provided.");
        return ResponseEntity.badRequest().body(errorDetails);
    }
}
