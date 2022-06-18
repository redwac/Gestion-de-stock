package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Long> {
}
