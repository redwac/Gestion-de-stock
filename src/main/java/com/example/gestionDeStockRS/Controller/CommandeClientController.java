package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.CommandeClient;
import com.example.gestionDeStockRS.Repository.CommandeClientRepository;
import com.example.gestionDeStockRS.Service.CommandeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/find/{id}")
    public Optional<CommandeClient> getCommandeClientByID(@PathVariable("id") Long id){
        return commandeClientService.getCommandeClientByID(id);
    }

    @PostMapping("/create")
    public void addCmdClient(@RequestBody CommandeClient commandeClient){
        commandeClientService.addCmdClient(commandeClient);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCmdClientParId(@PathVariable("id") Long id){
        commandeClientService.deleteCmdClientParId(id);
    }
}
