package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMain {

    @RequestMapping("hola")
    public String hola(Model modelo) {
        modelo.addAttribute("mensaje","hola desde thymeleaf");
        return "hola";
    }

    @GetMapping("/adios")
    public String mostrarPaginaInicio(Model model) {
        model.addAttribute("nombreUsuario", "María");
        return "adios";
    }

    @GetMapping("/contacto")
    public String mostrarPaginaContacto(Model model) {
        model.addAttribute("email", "contacto@ejemplo.com");
        return "contacto";
    }


}
