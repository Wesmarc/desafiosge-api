package com.sgebackend.blog.desafiosgeapi.repository;

import com.sgebackend.blog.desafiosgeapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesafiosgeRepository extends JpaRepository<Post, Long> {
}
