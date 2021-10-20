package me.hongbin.jpasample.post;

import java.time.LocalDateTime;
import java.util.List;

import me.hongbin.jpasample.comment.Comment;
import me.hongbin.jpasample.user.User;

public class Post {

    private final User author;
    private final String title;
    private final String content;
    private final LocalDateTime createAt;
    private final List<Comment> comments;

    public Post(User author, String title, String content, LocalDateTime createAt,
        List<Comment> comments) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.createAt = createAt;
        this.comments = comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
