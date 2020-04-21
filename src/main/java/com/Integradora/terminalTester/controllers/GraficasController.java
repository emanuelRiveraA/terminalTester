package com.Integradora.terminalTester.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/graficas")
public class GraficasController {

    @GetMapping("")
    public String goGraficas(){
        return "graficas";
    }
}
