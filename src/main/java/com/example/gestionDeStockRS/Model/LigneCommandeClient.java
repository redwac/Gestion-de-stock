package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligneCommandeClient")
public class LigneCommandeClient extends AbstractClasse{

    /*@Id
    private Long id ;*/

    @Column(name = "codeLigneCommande")
    private String codeLC;

    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "commandeClientId")
    private CommandeClient commandeClient;
}
