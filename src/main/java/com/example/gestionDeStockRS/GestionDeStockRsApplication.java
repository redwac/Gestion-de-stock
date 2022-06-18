package com.example.gestionDeStockRS;

import com.example.gestionDeStockRS.Model.Article;
import com.example.gestionDeStockRS.Model.Category;
import com.example.gestionDeStockRS.Repository.ArticleRepository;
import com.example.gestionDeStockRS.Repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionDeStockRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeStockRsApplication.class, args);
	}


}
