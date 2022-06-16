package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "utilisateur", uniqueConstraints = {@UniqueConstraint(name = "utilisateur_email_unique", columnNames = "email")})
public class Utilisateur extends AbstractClasse{

    /*@Id
    private Long id;*/

    @Column(name = "userName")
    private String nom;

    @Column(name = "userLastName")
    private String prenom;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private Entreprise entreprise;
}
