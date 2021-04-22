package com.example.demo.service;


import com.example.demo.domain.Post;
import com.example.demo.exception.DuplicatedPostException;
import com.example.demo.exception.NotFoundPostException;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> getAll(){
       return postRepository.getAll();
    }


    @Override
    public Post getOne(long id) throws NotFoundPostException {
        Post p = postRepository.getOne(id);
        if (p == null) {
            String msg = String.format("Can not found post with id: %d", id);
            throw new NotFoundPostException(msg);
        }

        return p;
    }

    @Override
    public boolean add(Post p) throws DuplicatedPostException {
        boolean result = postRepository.add(p);
        if (result == false) {
            String msg = String.format("Id %s is existed", p.getId());
            throw new DuplicatedPostException(msg);
        }
        return true;
    }

    @Override
    public boolean delete(long id) throws NotFoundPostException {
        boolean result = postRepository.delete(id);
        if (result == false){
            String msg = String.format("Can not found post with id: %d", id);
            throw new NotFoundPostException(msg);
        }
        return true;
    }
}
