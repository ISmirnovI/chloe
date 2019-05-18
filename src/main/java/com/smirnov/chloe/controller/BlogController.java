package com.smirnov.chloe.controller;

import com.smirnov.chloe.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    private final ArticleRepository articleRepository;

    @Autowired
    public BlogController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/blog")
    public String changing(Model model) {
        model.addAttribute("article", articleRepository.findById(1).get());
        return "index";
    }
}
