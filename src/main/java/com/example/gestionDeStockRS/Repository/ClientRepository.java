package com.example.gestionDeStockRS.Repository;

import com.example.gestionDeStockRS.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
