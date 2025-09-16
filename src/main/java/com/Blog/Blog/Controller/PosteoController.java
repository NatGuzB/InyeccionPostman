package com.Blog.Blog.Controller;
import com.Blog.Blog.Model.Posteo;
import com.Blog.Blog.Service.IservicePosteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posteos")
public class PosteoController {
    private final IservicePosteo posteoService;

    // Inyección por constructor A URL
    @Autowired
    public PosteoController(IservicePosteo posteoService) {
        this.posteoService = posteoService;
    }

    @GetMapping
    public List<Posteo> getAllPosteos() {
        return posteoService.getAllPosteos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Posteo> getPosteoById(@PathVariable Long id) {
        Optional<Posteo> posteoOptional = posteoService.getPosteoById(id);
        if (posteoOptional.isPresent()) {
            return ResponseEntity.ok(posteoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
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
