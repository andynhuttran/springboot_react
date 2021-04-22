package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping()
    public List<Post> getAll(){
        return postService.getAll();
    }


    @GetMapping("/{id}")
    public Post getOnePost(@PathVariable long id){
        return postService.getOne(id);
    }

    @PostMapping
    public void addPost(@RequestBody Post p){
        postService.add(p);
    }

    @DeleteMapping("/{id}")
    public void addPost(@PathVariable long id){
        postService.delete(id);
    }


}
