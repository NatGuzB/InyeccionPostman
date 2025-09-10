package com.Blog.Blog.Service;
import com.Blog.Blog.Model.Posteo;
import com.Blog.Blog.Repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteoService implements IservicePosteo {
    private final IposteoRepository posteoRepository;

    // Inyección por constructor a GETTERS Y SETTERS
    public PosteoService(IposteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> getAllPosteos() {
        return posteoRepository.findAll();
    }

    @Override
    public Posteo getPosteoById(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public void createPosteo(Posteo posteo) {
        posteoRepository.save(posteo);
    }

    @Override
    public void updatePosteo(Posteo posteo) {
        posteoRepository.update(posteo);
    }

    @Override
    public void deletePosteo(Long id) {
        posteoRepository.deleteById(id);
    }
}