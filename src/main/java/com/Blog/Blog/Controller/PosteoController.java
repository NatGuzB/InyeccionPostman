package com.Blog.Blog.Controller;
import com.Blog.Blog.Model.Posteo;
import com.Blog.Blog.Service.IservicePosteo;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {
    private final IservicePosteo posteoService;

    // Inyección por constructor A URL
    public PosteoController(IservicePosteo posteoService) {
        this.posteoService = posteoService;
    }

    @GetMapping
    public List<Posteo> getAllPosteos() {
        return posteoService.getAllPosteos();
    }

    @GetMapping("/{id}")
    public Posteo getPosteoById(@PathVariable Long id) {
        return posteoService.getPosteoById(id);
    }

    @PostMapping("/crear")
    public void createPosteo(@RequestBody Posteo posteo) {
        posteoService.createPosteo(posteo);
    }

    @PutMapping("/{id}")
    public void updatePosteo(@PathVariable Long id, @RequestBody Posteo posteo) {
        posteo.setId(id);
        posteoService.updatePosteo(posteo);
    }

    @DeleteMapping("/{id}")
    public void deletePosteo(@PathVariable Long id) {
        posteoService.deletePosteo(id);
    }
}
