package com.cardan.api.service;

import com.cardan.api.model.ClientEntity;
import com.cardan.api.respository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public List<ClientEntity> findAll() {
        return clientRepository.findAll();
    }
}
