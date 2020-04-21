package com.Integradora.terminalTester.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablas")
public class TablaController {

    @GetMapping("")
    public String goTabla(){
        return "tablas";
    }
}
