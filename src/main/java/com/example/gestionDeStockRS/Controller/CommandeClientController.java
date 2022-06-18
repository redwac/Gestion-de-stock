package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.CommandeClient;
import com.example.gestionDeStockRS.Repository.CommandeClientRepository;
import com.example.gestionDeStockRS.Service.CommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/cmdclient")
public class CommandeClientController {


    public CommandeClientService commandeClientService;

    @Autowired
    public CommandeClientController(CommandeClientService commandeClientService){
        this.commandeClientService = commandeClientService;
    }

    @GetMapping("/all")
    public List<CommandeClient> getCommandeClients(){
        return commandeClientService.getAllcmdClients();
    }
}
