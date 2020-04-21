package com.Integradora.terminalTester.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroController {
    @GetMapping("")
    public String goRegistro(){
        return "registro";
    }
}
