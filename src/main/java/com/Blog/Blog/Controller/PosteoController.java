package com.Blog.Blog.Controller;

import com.Blog.Blog.Model.Posteo;
import com.Blog.Blog.Service.IPosteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posteos")
public class PosteoController {
    @Autowired
    private IPosteoService posteoService;

    @GetMapping
    public List<Posteo> getAllPosteos() {
        return posteoService.getAllPosteos();
    }

    @GetMapping("/{id}")
    public Optional<Posteo> getPosteoById(@PathVariable Long id) {
        return posteoService.getPosteoById(id);
    }

    @PostMapping
    public Posteo createPosteo(@RequestBody Posteo posteo) {
        return posteoService.createPosteo(posteo);
    }

    @PutMapping("/{id}")
    public Posteo updatePosteo(@PathVariable Long id, @RequestBody Posteo posteo) {
        posteo.setId(id);
        return posteoService.updatePosteo(posteo);
    }

    @DeleteMapping("/{id}")
    public void deletePosteo(@PathVariable Long id) {
        posteoService.deletePosteo(id);
    }

    @GetMapping("/author/{authorId}")
    public List<Posteo> getPosteosByAuthorId(@PathVariable Long authorId) {
        return posteoService.getPosteosByAuthorId(authorId);
    }
}


