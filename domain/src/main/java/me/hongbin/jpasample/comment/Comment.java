package me.hongbin.jpasample.comment;

import java.time.LocalDateTime;

import me.hongbin.jpasample.user.User;

public class Comment {

    private final User user;
    private final String content;
    private final LocalDateTime createAt;

    public Comment(User user, String content, LocalDateTime createAt) {
        this.user = user;
        this.content = content;
        this.createAt = createAt;
    }
}
