package com.Integradora.terminalTester.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/creditos")
public class CreditosContoller {

     @GetMapping("")
    public String creditos(){

         return "creditos";
     }
}
