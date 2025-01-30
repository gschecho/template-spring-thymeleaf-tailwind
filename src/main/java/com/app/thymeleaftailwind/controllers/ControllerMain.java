package com.app.thymeleaftailwind.controllers;

import com.app.thymeleaftailwind.models.Test;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerMain implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        model.addAttribute("errorMessage", "Página no encontrada o error interno.");
        return "error"; // Asegúrate de que error.html esté en templates
    }

    @GetMapping("/hola")  // Usar @GetMapping en vez de @RequestMapping para claridad
    public String hola(Model model) {  // Renombrado 'modelo' a 'model' (convención)

        Test test = new Test(5L,"TestNombre","Esto es un test");
        model.addAttribute("name", test.getName());
        model.addAttribute("description", test.getDescription());
        return "hola";  // No es necesario ".html", Thymeleaf lo busca automáticamente
    }

    @GetMapping("/adios")
    public String mostrarPaginaInicio(Model model) {
        model.addAttribute("nombreUsuario", "María");

        return "adios"; // Asegurar que adios.html existe en templates
    }

    @GetMapping("/contacto")
    public String mostrarPaginaContacto(Model model) {
        model.addAttribute("email", "contacto@ejemplo.com");
        return "contacto"; // Asegurar que contacto.html existe en templates
    }
}
