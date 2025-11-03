package br.com.fatec.atv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class NomeController {

    @GetMapping("/nome")
    public String retornaNome(){
        return "Jaquelaine Ramos";
    }

}