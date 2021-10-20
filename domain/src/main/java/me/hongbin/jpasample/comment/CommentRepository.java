package me.hongbin.jpasample.comment;

public interface CommentRepository {

    void add(Comment comment);

    void findAllByPostId(Long postId);
}
