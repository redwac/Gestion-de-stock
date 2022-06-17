package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
}
