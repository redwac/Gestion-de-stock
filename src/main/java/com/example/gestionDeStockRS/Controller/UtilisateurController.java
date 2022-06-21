package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Utilisateur;
import com.example.gestionDeStockRS.Repository.UtilisateurRepository;
import com.example.gestionDeStockRS.Service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/find/{id}")
    public Optional<Utilisateur> getUserByID(@PathVariable("id") Long id){
        return utilisateurService.getUtilisateurByID(id);
    }

    @PostMapping("/create")
    public void addUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurService.addUtilisateur(utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserParId(@PathVariable("id") Long id){
        utilisateurService.deleteUserParId(id);
    }
}
