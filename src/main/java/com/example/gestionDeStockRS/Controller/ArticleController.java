package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/article")
public class ArticleController {

    private final ArticleService  articleService;

    @Autowired
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }

    @GetMapping("/all")
    public List<Article> getArticles(){
        return articleService.getArticles();
    }

    @GetMapping("/find/{id}")
    public Optional<Article> getArticle(@PathVariable("id") Long id){
        return articleService.getArticleById(id);
    }

    @PostMapping("/create")
    public void ajouterArticle(@Validated @RequestBody Article article){
        articleService.addArticle(article);
        System.out.println("controller ART ");
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticleById(@PathVariable("id") Long id){
        articleService.supprimerArticleParId(id);
    }
}
