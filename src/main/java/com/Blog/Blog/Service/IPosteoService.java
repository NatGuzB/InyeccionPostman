package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Posteo;
import java.util.List;
import java.util.Optional;

public interface IPosteoService {
    List<Posteo> getAllPosteos();
    Optional<Posteo> getPosteoById(Long id);
    Posteo createPosteo(Posteo posteo);
    Posteo updatePosteo(Posteo posteo); // Cambiado de void a Posteo
    void deletePosteo(Long id);
    List<Posteo> getPosteosByAuthorId(Long authorId);
}
