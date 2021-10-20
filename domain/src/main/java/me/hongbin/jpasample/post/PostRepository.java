package me.hongbin.jpasample.post;

import java.util.List;

public interface PostRepository {

    void save(Post post);

    List<Post> findAll();

    Post findById(Long id);
}
