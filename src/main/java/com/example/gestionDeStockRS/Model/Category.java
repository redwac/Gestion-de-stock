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
@Table(name = "Category")
public class Category extends AbstractClasse{

    /*@Id
    @SequenceGenerator(
            name = "Category_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    private Long id;*/

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category")
    List<Article> articles ;
}
