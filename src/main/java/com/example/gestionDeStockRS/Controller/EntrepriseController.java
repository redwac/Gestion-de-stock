package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Entreprise;
import com.example.gestionDeStockRS.Repository.EntrepriseRepository;
import com.example.gestionDeStockRS.Service.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/find/{id}")
    public Optional<Entreprise> getEntrepriseByID(@PathVariable("id") Long id){
        return entrepriseService.getEntrepriseByID(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntrepriseParId(@PathVariable("id") Long id){
        entrepriseService.deleteEntrepriseParId(id);
    }
}
