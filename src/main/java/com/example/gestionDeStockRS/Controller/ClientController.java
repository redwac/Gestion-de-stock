package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Client;
import com.example.gestionDeStockRS.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/client")
public class ClientController {

    public ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/all")
    public List<Client> getClients(){
        return clientService.getAllClient();
    }

    @GetMapping("/find/{id}")
    public Optional<Client> getClientBYID(@PathVariable("id") Long id){
        return clientService.getClientByID(id);
    }

    @PostMapping("/create")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClientParId(@PathVariable("id") Long id){
        clientService.supprimerClientParId(id);
    }
}
