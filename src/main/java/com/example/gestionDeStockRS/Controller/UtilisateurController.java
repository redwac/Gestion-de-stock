package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Utilisateur;
import com.example.gestionDeStockRS.Repository.UtilisateurRepository;
import com.example.gestionDeStockRS.Service.UtilisateurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UtilisateurController {

    public UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/all")
    public List<Utilisateur> getAllUsers(){
        return utilisateurService.getAllUsers();
    }
}
