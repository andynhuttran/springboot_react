package com.example.demo.controller;

import com.example.demo.domain.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping()
    public List<Post> getAll(){
        List<Post> list = postService.getAll();
        return list.stream().map(p -> {
            addHyperLink(p);
            return p;
        }).collect(Collectors.toList());
    }

    private void addHyperLink(Post p){
        p.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(PostController.class).getOnePost(p.getId())).withSelfRel());
    }


    @GetMapping("/{id}")
    public Post getOnePost(@PathVariable long id){
        Post post = postService.getOne(id);
        addHyperLink(post);
        return post;
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
