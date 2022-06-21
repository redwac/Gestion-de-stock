package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

    Optional<Entreprise> findEntrepriseById(Long id);

    void deleteById(Long id);
}
