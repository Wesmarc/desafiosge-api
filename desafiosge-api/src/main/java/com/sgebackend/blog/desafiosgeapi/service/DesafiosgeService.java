package com.sgebackend.blog.desafiosgeapi.service;

import com.sgebackend.blog.desafiosgeapi.model.Post;

import java.util.List;

//Criação dos métodos e a implementação dos mesmos na interface ServiceImpl
//Método List - Retorna lista de post - nome findAll
//Método Post - Retorna um único post - nome findBuId (precisa de um parâmetro id do tipo long)
//Método save - Recebe o post para salvar no banco de dados
public interface DesafiosgeService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
