package com.app.thymeleaftailwind.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


        @GetMapping("/test")
        public String testThymeleaf() {
            return "index";
        }
    }

