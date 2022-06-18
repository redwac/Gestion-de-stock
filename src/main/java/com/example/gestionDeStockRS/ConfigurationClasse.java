package com.example.gestionDeStockRS;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Repository.ArticleRepository;
import com.example.gestionDeStockRS.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigurationClasse {

    ArticleRepository articleRepository;

    @Autowired
    public ConfigurationClasse(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    //@Bean
    /*
    * @Bean
	CommandLineRunner commandLineRunner(CategoryRepository categoryRepository) {
		return args -> {
			Category category1 = new Category(1L,"informatique", null);

			categoryRepository.save(category1);
		};
    * */
    @Bean
    CommandLineRunner commandLineRunner(ArticleRepository articleRepository, CategoryRepository categoryRepository){
        return args -> {
            Category category1 = new Category(1L,"informatique", null);

            categoryRepository.save(category1);

            Article art1 = new Article("AR_D1", "HDD", null,null,null );
            Article art2 =new Article("AR_D1","HDD",null,null,null);

            articleRepository.saveAll(List.of(art1,art2));
        };



    }
}
