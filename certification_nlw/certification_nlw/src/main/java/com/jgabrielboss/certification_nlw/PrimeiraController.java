package com.jgabrielboss.certification_nlw;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/primeiraController")

public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public String retornoController() {
        return "Minha primeira Controller!!";
    }

    @PostMapping("/retornaPost")
    public String primeiroPost(){
    return "Meu primerio POST";
    }
}