package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Entreprise;
import com.example.gestionDeStockRS.Repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseService {

    EntrepriseRepository entrepriseRepository ;

    @Autowired
    public EntrepriseService(EntrepriseRepository entrepriseRepository){
        this.entrepriseRepository = entrepriseRepository;
    }

    public List<Entreprise> getEntreprises(){
        return entrepriseRepository.findAll();

    }
}
