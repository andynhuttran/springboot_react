package com.example.demo.repository;


import com.example.demo.domain.Post;

import java.util.List;

public interface PostRepository {

    public List<Post> getAll();
    public Post getOne(long id);

    public boolean add(Post p);
    public boolean delete(long id);
}
