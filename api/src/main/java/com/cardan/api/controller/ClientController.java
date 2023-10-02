package com.cardan.api.controller;


import com.cardan.api.model.ClientEntity;
import com.cardan.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {
    @Autowired
    ClientService clientService;
    @GetMapping
    public List<ClientEntity> fetchAll() {
        return clientService.findAll();
    }
}
