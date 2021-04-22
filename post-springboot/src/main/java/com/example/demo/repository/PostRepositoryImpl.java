package com.example.demo.repository;


import com.example.demo.domain.Post;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository{

    List<Post> posts = new ArrayList<Post>();

    @PostConstruct
    public void initData(){
        System.out.println("In initData()");

        posts.add(new Post(1,"MIU","Its awsome","Tran"));
        posts.add(new Post(2,"Mansif","Amazing","Aldini"));
    }

    @Override
    public List<Post> getAll(){
        return posts;
    }

    @Override
    public Post getOne(long id) {
        return posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElseGet(() -> null);
    }

    @Override
    public boolean add(Post p) {
        Post checkPost = this.getOne(p.getId());
        if (checkPost != null) return false;

        posts.add(p);
        return true;
    }

    @Override
    public boolean delete(long id) {
        for (int i = 0; i < posts.size(); ++i){
            if (posts.get(i).getId() == id){
                posts.remove(i);
                return true;
            }
        }

        return false;
    }
}
