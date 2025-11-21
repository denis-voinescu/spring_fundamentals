package chapter_4.dependency_injection.services;

import chapter_4.dependency_injection.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public void storeComment() {
        repository.storeComment();
    }
}
