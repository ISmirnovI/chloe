package com.smirnov.chloe.controller;

import com.smirnov.chloe.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.smirnov.chloe.repository.ArticleRepository;

@Controller
@RequestMapping("/article")

public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("show")
    public @ResponseBody String addNewArticle (@RequestParam String headline) {

        Article n = new Article();
        n.setHeadline(headline);
        articleRepository.save(n);
        return "articles.html";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    @GetMapping("delete/{articleId}")
    public @ResponseBody String deleteArticle (@PathVariable Integer articleId){
        if(articleRepository.existsById(articleId)){
            articleRepository.deleteById(articleId);
            return("Article had been deleted.");
        } else {
            return("This article doesn't exist.");
        }

    }

    @GetMapping("delete/all")
    public @ResponseBody String deleteAllArticle (){
        articleRepository.deleteAll();
        return ("All articles had been successfully deleted");
    }

}
