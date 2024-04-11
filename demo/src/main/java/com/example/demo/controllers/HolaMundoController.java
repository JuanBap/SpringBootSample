package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController{

    @GetMapping("/")
    String hola (){
        return "Hola Mundo!";
    }
    
    @GetMapping("/usuarios")
    String holaUsuario (){
        return "Hola, usuarios.";
    }

    @GetMapping("/administradores")
    String holaAdmin (){
        return "Hola, administradores.";
    }


}