package com.curso.boot.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")

public class CargoController {


    @GetMapping("/cadastrar")
    public String Cadastrar(){
        return "/cargos/cadastrar";
    }

    @GetMapping("/listar")
    public String Listar(){
        return "/cargos/listar";
    }


}
