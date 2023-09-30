package com.cardan.api.controller;

import com.cardan.api.model.Wallet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @PostMapping
    private String create(){
        return "post";
    }
    @GetMapping
    public String read(){
        return "get";
    }
    @PutMapping
    public String update(){
        return "put";
    }
    @DeleteMapping
    public String delete(){
        return "del";
    }

    @PostMapping("/create")
    public Wallet createWallet(@RequestBody Wallet wallet){
        return wallet;
    }

    @GetMapping("/path/{id}")
    public Wallet getWalletByPathVariable(@PathVariable int id){
        var wallet = new Wallet();
        wallet.setId(id);
        wallet.setQty(id*2);
        return wallet;
    }

    @GetMapping("/parameter")
    public Wallet getWalletByParameter(@RequestParam int id){
        var wallet = new Wallet();
        wallet.setId(id);
        wallet.setQty(id*2);
        return wallet;
    }
}
