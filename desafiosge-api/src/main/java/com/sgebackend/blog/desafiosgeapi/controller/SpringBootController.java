package com.sgebackend.blog.desafiosgeapi.controller;


import com.sgebackend.blog.desafiosgeapi.model.Post;
import com.sgebackend.blog.desafiosgeapi.service.DesafiosgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SpringBootController {

    @Autowired
    DesafiosgeService desafiosgeService;

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





}