package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commandeClient")
public class CommandeClient extends AbstractClasse{

    /*@Id
    private Long id;*/

    @Column(name = "codeCommande")
    private String codeCommande;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

}
