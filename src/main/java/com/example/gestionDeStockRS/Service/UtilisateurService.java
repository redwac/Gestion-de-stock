package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Utilisateur;
import com.example.gestionDeStockRS.Repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    public UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }

    public List<Utilisateur> getAllUsers(){
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> getUtilisateurByID(Long id){
        return utilisateurRepository.findUtilisateurById(id);
    }

    public void deleteUserParId(Long id){
        utilisateurRepository.deleteById(id);
        System.out.println("Utilisateur avec id = " + id + " a été supprimé avec succé");
    }
}
