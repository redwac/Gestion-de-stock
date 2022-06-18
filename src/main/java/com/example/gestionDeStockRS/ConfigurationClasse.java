package com.example.gestionDeStockRS;

import com.example.gestionDeStockRS.Model.*;
import com.example.gestionDeStockRS.Repository.*;
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
    CommandLineRunner commandLineRunner(
            ArticleRepository articleRepository,
            CategoryRepository categoryRepository,
            EntrepriseRepository entrepriseRepository,
            UtilisateurRepository utilisateurRepository,
            LigneCommandeClientRepository ligneCommandeClientRepository,
            CommandeClientRepository commandeClientRepository,
            ClientRepository clientRepository){
        return args -> {
            Category category1 = new Category(1L,"informatique", null);

            categoryRepository.save(category1);

            Article art1 = new Article("AR_D1", "HDD", null,null,null );
            Article art2 =new Article("AR_D1","HDD",null,null,null);

            articleRepository.saveAll(List.of(art1,art2));

            Entreprise CS3C = new Entreprise("rabat hn",null,null);
            Entreprise SMTGC = new Entreprise("madrid centre",null,null);
            entrepriseRepository.saveAll(List.of(CS3C,SMTGC));

            Utilisateur batistuta = new Utilisateur("bati","gool","bati@mail.com",null);
            Utilisateur zidan = new Utilisateur("zidan","zizo","zizo@mail.com",null);
            utilisateurRepository.saveAll(List.of(batistuta,zidan));

            LigneCommandeClient ligneCommandeClient1 = new LigneCommandeClient("LC1",null,null);
            LigneCommandeClient ligneCommandeClient2 = new LigneCommandeClient("LC2",null,null);
            ligneCommandeClientRepository.saveAll(List.of(ligneCommandeClient1,ligneCommandeClient2));

            CommandeClient commandeClient1 = new CommandeClient("commandeL1",null,null);
            CommandeClient commandeClient2 = new CommandeClient("commandeL2",null,null);
            commandeClientRepository.saveAll(List.of(commandeClient1,commandeClient2));

            Client nirvana = new Client("curt","cuben",null);
            Client mettalica = new Client("jamse","Hetfield",null);
            clientRepository.saveAll(List.of(nirvana,mettalica));
        };



    }
}
