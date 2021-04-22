package com.example.demo.service;


import com.example.demo.domain.Post;
import com.example.demo.exception.DuplicatedPostException;
import com.example.demo.exception.NotFoundPostException;

import java.util.List;

public interface PostService {

    public List<Post> getAll();
    public Post getOne(long id) throws NotFoundPostException;

    public boolean add(Post p) throws DuplicatedPostException;
    public boolean delete(long id) throws NotFoundPostException;
}
