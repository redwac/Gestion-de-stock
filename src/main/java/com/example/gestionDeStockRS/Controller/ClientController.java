package com.example.gestionDeStockRS.Controller;

import com.example.gestionDeStockRS.Model.Client;
import com.example.gestionDeStockRS.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
