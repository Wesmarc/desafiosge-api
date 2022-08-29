package com.sgebackend.blog.desafiosgeapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDate;

//Classe será uma tabela no banco de dados e recebeu anotação entity por este motivo
//Quando o comando spring.jpa.hibernate.ddl-auto=update executar automaticamente, a tabela receberá o nome de "TB_POST"
//Criado também os atributos e os métodos getters e setters subsequentes
//Os atributos que não podem ficar em branco foram anotados com @NotBlank, no caso do texto para poder receber uma loga lista de caracteres recebeu também a anotação @lob
//No atributo data foi inseria a anotação @JsonFormat para indicar o formato de data desejado
@Entity
@Table(name="TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String autor;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private LocalDate data;
    @NotBlank
    @Lob
    private String texto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
