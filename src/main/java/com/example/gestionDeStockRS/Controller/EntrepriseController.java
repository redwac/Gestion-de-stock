package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Entreprise;
import com.example.gestionDeStockRS.Repository.EntrepriseRepository;
import com.example.gestionDeStockRS.Service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/entreprise")
public class EntrepriseController {

    EntrepriseService entrepriseService;

    @Autowired
    public EntrepriseController(EntrepriseService entrepriseService){
        this.entrepriseService = entrepriseService ;
    }

    @GetMapping("/all")
    public List<Entreprise> getAllEntreprise(){
        return entrepriseService.getEntreprises() ;
    }
}
