package com.sgebackend.blog.desafiosgeapi.service.ServiceImpl;

import com.sgebackend.blog.desafiosgeapi.model.Post;
import com.sgebackend.blog.desafiosgeapi.repository.DesafiosgeRepository;
import com.sgebackend.blog.desafiosgeapi.service.DesafiosgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Classe anotada como @Service para informar ao Spring que ela será um bin gerenciada por ele
//Criação da classe DesafiosgeServiceImpl e implemantado a classe DesafiosgeService
//Os métodos criados em DesafiosgeService foram implementados (list-fidAll, post-findById e save)
//Inserido ponto de injeção do Repository @Autowrided
//O método findAll tem como retorno o findAll
//Foi inserido .get no retorno do Post porque foi declarado que o retorno seria um optional e não um optional de post
@Service
public class DesafiosgeServiceImpl implements DesafiosgeService {

    @Autowired
    DesafiosgeRepository desafiosgeRepository;

    @Override
    public List<Post> findAll() {
        return desafiosgeRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return desafiosgeRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return desafiosgeRepository.save(post);
    }
}
