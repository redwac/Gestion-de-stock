package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Entreprise;
import com.example.gestionDeStockRS.Repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    public Optional<Entreprise> getEntrepriseByID(Long id){

        return entrepriseRepository.findEntrepriseById(id);
    }

    public void addEntreprise(Entreprise entreprise){
        entrepriseRepository.save(entreprise);
    }

    public void deleteEntrepriseParId(Long id){
        entrepriseRepository.deleteById(id);
        System.out.println("l entreprise avec id = " + id + "a été supprimé avec succé");
    }
}
