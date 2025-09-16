package com.Blog.Blog.Service;

import com.Blog.Blog.Model.Posteo;
import com.Blog.Blog.Repository.IposteoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PosteoService implements IPosteoService {
    private final IposteoRepository posteoRepository;

    public PosteoService(IposteoRepository posteoRepository) {
        this.posteoRepository = posteoRepository;
    }

    @Override
    public List<Posteo> getAllPosteos() {
        return posteoRepository.findAll();
    }

    @Override
    public Optional<Posteo> getPosteoById(Long id) {
        return posteoRepository.findById(id);
    }

    @Override
    public Posteo createPosteo(Posteo posteo) {
        return posteoRepository.save(posteo);
    }

    @Override
    public Posteo updatePosteo(Posteo posteo) {
        return posteoRepository.save(posteo);
    }

    @Override
    public void deletePosteo(Long id) {
        posteoRepository.deleteById(id);
    }

    @Override
    public List<Posteo> getPosteosByAuthorId(Long authorId) {
        return posteoRepository.findByAuthorId(authorId);
    }
}
