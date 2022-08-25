package com.sgebackend.blog.desafiosgeapi.service.ServiceImpl;

import com.sgebackend.blog.desafiosgeapi.model.Post;
import com.sgebackend.blog.desafiosgeapi.repository.DesafiosgeRepository;
import com.sgebackend.blog.desafiosgeapi.service.DesafiosgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
