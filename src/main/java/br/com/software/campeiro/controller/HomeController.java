package br.com.software.campeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/test")
    public String testMVCThymeleaf(){
        return "home";
    }

}
