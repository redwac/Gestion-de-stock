package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PutMapping("/update")
    public void ajouterArticle(@RequestBody Article article){
        articleService.addArticle(article);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticleById(@PathVariable("id") Long id){
        articleService.supprimerArticleParId(id);
    }
}
