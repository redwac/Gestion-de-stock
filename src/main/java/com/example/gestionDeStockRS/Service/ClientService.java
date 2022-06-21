package com.example.gestionDeStockRS.Service;

import com.example.gestionDeStockRS.Model.Client;
import com.example.gestionDeStockRS.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    public ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    public Optional<Client> getClientByID(Long id){

        return clientRepository.findClientById(id);
    }

    public void supprimerClientParId(Long id){
        clientRepository.deleteById(id);
        System.out.println("le client avec id = " +id+ " a été supprimé");
    }
}
