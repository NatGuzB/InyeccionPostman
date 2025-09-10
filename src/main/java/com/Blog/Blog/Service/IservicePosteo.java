package com.Blog.Blog.Service;
import com.Blog.Blog.Model.Posteo;
import java.util.List;

public interface IservicePosteo {
    List<Posteo> getAllPosteos();
    Posteo getPosteoById(Long id);
    void createPosteo(Posteo posteo);
    void deletePosteo(Long id);
    void updatePosteo(Posteo posteo);
}
