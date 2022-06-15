package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise {

    @Id
    private Long id ;

    @OneToMany(mappedBy = "entreprise")
    private List<Article> articles;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateur;

    
}
