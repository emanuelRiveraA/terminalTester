package com.Integradora.terminalTester.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/comp")

public class CpnController {


        @GetMapping("")
        public String goComponente(){

            return "comp";
        }
}


