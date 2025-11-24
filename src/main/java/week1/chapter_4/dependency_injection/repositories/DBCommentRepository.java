package week1.chapter_4.dependency_injection.repositories;

//@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment( ) {
        System.out.println("Storing comment from DBCommentRepository");
    }
}
