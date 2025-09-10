package com.Blog.Blog.Repository;
import com.Blog.Blog.Model.Posteo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository implements IposteoRepository {
    private List<Posteo> posteos = new ArrayList<>();

    public PosteoRepository() {
        posteos.add(new Posteo(1L, "Primer Post", "Autor 1"));
        posteos.add(new Posteo(2L, "Segundo Post", "Autor 2"));
    }

    @Override
    public List<Posteo> findAll() {
        return posteos;
    }

    @Override
    public Posteo findById(Long id) {
        for (Posteo posteo: posteos){
            if(posteo.getId().equals(id)){
                return posteo;
            }
        }
        return null;
    }

    @Override
    public void save(Posteo posteo) {
        posteos.add(posteo);
    }


    @Override
    public void update(Posteo posteoActualizado) {
        for (Posteo posteo : posteos) {
            if (posteo.getId().equals(posteoActualizado.getId())) {
                int index = posteos.indexOf(posteo); // Busca indice
                posteos.set(index, posteoActualizado);
                return;
            }
        }
    }

    @Override
    public void deleteById(Long id) {
        for (Posteo posteo : posteos) {
            if (posteo.getId().equals(id)) {
                posteos.remove(posteo);
                return;
            }
        }
    }



}