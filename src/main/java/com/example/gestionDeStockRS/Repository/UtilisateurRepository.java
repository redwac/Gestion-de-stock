package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findUtilisateurById(Long id);

    void deleteById(Long id);

}
