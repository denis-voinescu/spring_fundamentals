package week1.chapter_4.dependency_injection.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryCommentRepository implements CommentRepository {

    @Override
    public void storeComment( ) {
        System.out.println("Storing comment from InMemoryCommentRepository");
    }
}
