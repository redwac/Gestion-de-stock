package com.example.gestionDeStockRS.Model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractClasse implements Serializable {

    @Id
    @SequenceGenerator(name = "sequence_r",
            sequenceName = "sequence_r",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_r")
    private Long id;

    @Column(name = "dateInit", nullable = false, updatable = false)
    private Instant dateInit;

    @Column(name = "dateMaj", nullable = false)
    private Instant dateMaj;
}
