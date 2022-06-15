package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur {

    @Id
    private Long id;

    private String nom;

    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private Entreprise entreprise;
}
