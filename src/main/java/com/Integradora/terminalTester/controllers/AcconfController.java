package com.Integradora.terminalTester.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/confAvion")
public class AcconfController {


    @GetMapping("")
    public String goAcconf() {
        return "confAvion";
    }
}


