package com.sgebackend.blog.desafiosgeapi.controller;


import com.sgebackend.blog.desafiosgeapi.model.Post;
import com.sgebackend.blog.desafiosgeapi.service.DesafiosgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

//Criada nova classe SpringBootController
//Injeção DesafiosgeService referenciando a interface e não as implementações
//Criação do método get Posts modelAndView retornando tanto o post quanto a View posts.html
@Controller
public class SpringBootController {

    @Autowired
    DesafiosgeService desafiosgeService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = desafiosgeService.findAll();
        mv.addObject("posts", posts);
        return mv;

    }

    @RequestMapping(value = "/posts/(id)", method = RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable("id") long id) {
        ModelAndView mv = new ModelAndView("postDetails");
        Post post = desafiosgeService.findById(id);
        mv.addObject("post", post);
        return mv;


    }

    @RequestMapping(value = "/newpost", method = RequestMethod.GET)
    public String getPostForm() {
        return "postForm";
    }

    @RequestMapping(value = "/newpost", method = RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
        attributes.addFlashAttribute("messagem", "Verifique se os campos obrigatórios foram preenchidos!");
        if(result.hasErrors()) {
            return "redirect:/newpost";
        }
        post.setData(LocalDate.now());
        desafiosgeService.save(post);
        return "redirect:/posts";
    }




}
