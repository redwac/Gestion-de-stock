package com.example.gestionDeStockRS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article")
public class Article extends AbstractClasse{

    /*@Id
    @SequenceGenerator(
            name = "Article_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;*/

    @Column(name = "nomArticle", nullable = false)
    private String nomArticle;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "article")
    List<LigneCommandeClient> ligneCommandeClients;

    @ManyToOne
    @JoinColumn(name = "entrepriseId")
    private Entreprise entreprise;
}
