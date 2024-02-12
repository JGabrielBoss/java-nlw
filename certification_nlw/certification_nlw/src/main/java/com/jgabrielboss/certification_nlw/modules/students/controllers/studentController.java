package com.jgabrielboss.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jgabrielboss.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.jgabrielboss.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class studentController {

    //Preciso usar o meu UseCase
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
        //Ele vai receber
        //Email
        //Technology

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);

        if(result){
            return "Usuario já fez a prova";
        }
        return "Usuario pode fazer a prova";
    }
}
