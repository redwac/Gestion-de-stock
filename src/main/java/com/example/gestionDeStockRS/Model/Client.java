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
@Table(name = "client")
public class Client extends AbstractClasse{

    /*@Id
    private Long id;*/

    @Column(name = "nomClient")
    private String nom;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
