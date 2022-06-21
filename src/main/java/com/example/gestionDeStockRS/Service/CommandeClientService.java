package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.CommandeClient;
import com.example.gestionDeStockRS.Repository.CommandeClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeClientService {

    public CommandeClientRepository commandeClientRepository;

    public CommandeClientService(CommandeClientRepository commandeClientRepository){
        this.commandeClientRepository = commandeClientRepository;
    }

    public List<CommandeClient> getAllcmdClients(){

        return commandeClientRepository.findAll();
    }

    public Optional<CommandeClient> getCommandeClientByID(Long id){
        return commandeClientRepository.findCommandeClientById(id);
    }

    public void deleteCmdClientParId(Long id){
        commandeClientRepository.deleteById(id);
        System.out.println("la commande client avec id = " + id + " a été supprimé");
    }
}
