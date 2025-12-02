package week1.chapter4.dependency_injection.services;

import week1.chapter4.dependency_injection.repositories.CommentRepository;
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
