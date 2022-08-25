package com.sgebackend.blog.desafiosgeapi.service;

import com.sgebackend.blog.desafiosgeapi.model.Post;

import java.util.List;

public interface DesafiosgeService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
