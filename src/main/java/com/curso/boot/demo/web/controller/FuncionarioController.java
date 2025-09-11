package com.curso.boot.demo.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")

public class FuncionarioController {

    @GetMapping("/cadastrar")
    public String Cadastrar(){
        return "/funcionarios/cadastrar";
    }

    @GetMapping("/listar")
    public String Listar(){
        return "/funcionarios/listar";
    }


}
