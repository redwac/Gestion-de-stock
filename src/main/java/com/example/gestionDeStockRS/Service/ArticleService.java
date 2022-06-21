package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Repository.ArticleRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Article> getArticleById(Long id){
        return articleRepository.findArticleById(id);
    }

    public void addArticle(Article article){
        articleRepository.save(article);
    }

    public void supprimerArticleParId(Long id){
        articleRepository.deleteById(id);
        System.out.println("l article avec id = " + id + " a été supprimé ");
    }


}
