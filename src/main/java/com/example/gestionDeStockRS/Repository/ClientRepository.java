package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

    Optional<Client> findClientById(Long id);

    void deleteById(Long id);
}
