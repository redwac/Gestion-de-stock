package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.CommandeClient;
import com.example.gestionDeStockRS.Repository.CommandeClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeClientService {

    public CommandeClientRepository commandeClientRepository;

    public CommandeClientService(CommandeClientRepository commandeClientRepository){
        this.commandeClientRepository = commandeClientRepository;
    }

    public List<CommandeClient> getAllcmdClients(){
        return commandeClientRepository.findAll();
    }
}
