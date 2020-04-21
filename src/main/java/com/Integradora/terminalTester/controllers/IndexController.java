package com.Integradora.terminalTester.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/principal")
public class IndexController {

    @GetMapping("")
    public String goIndex(){
        return "principal";
    }
}
