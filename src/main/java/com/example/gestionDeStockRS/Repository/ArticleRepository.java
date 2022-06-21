package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {


    Optional<Article> findArticleById(Long id);

    void deleteById(Long id);

    // public Article getArticleByCodeArticle(String codeArticle);
}
