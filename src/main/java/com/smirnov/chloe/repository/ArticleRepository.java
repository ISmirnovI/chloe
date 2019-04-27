package com.smirnov.chloe.repository;

import com.smirnov.chloe.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}