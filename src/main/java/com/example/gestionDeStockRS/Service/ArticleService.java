package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {


    ArticleRepository articleRepository ;

    @Autowired
    public ArticleService(ArticleRepository articleRepository){

        this.articleRepository = articleRepository;
    };


    public List<Article> getArticles(){
        return articleRepository.findAll();
    }
}
