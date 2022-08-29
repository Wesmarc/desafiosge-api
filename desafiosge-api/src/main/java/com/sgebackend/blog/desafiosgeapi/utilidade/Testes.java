package com.sgebackend.blog.desafiosgeapi.utilidade;

import com.sgebackend.blog.desafiosgeapi.model.Post;
import com.sgebackend.blog.desafiosgeapi.repository.DesafiosgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Testes {
    @Autowired
    DesafiosgeRepository desafiosgeRepository;

    @PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Tialei Lemos");
        post1.setData(LocalDate.now());
        post1.setTitulo("Pensamentos");
        post1.setTexto("Gosto de jogos, principalmente de Playstation 4.");

        Post post2 = new Post();
        post2.setAutor("Fabricio França");
        post2.setData(LocalDate.now());
        post2.setTitulo("Meu trabalho");
        post2.setTexto("Gosto do meu trabalho, estou muito satisfeito com o que estou fazendo.");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = desafiosgeRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
