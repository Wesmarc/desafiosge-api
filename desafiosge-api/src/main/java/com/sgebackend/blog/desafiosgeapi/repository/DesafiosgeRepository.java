package com.sgebackend.blog.desafiosgeapi.repository;

import com.sgebackend.blog.desafiosgeapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//Com a criação do repositório e com a extenção do JPARepository a aplicação terá acesso a métodos do Spring Data já prontos
//Interface extendida com o JPARepository
//Repassado o Model (Post) e também o ID (Long)
public interface DesafiosgeRepository extends JpaRepository<Post, Long> {
}
