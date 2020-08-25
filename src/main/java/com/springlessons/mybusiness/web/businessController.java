package com.springlessons.mybusiness.web;

import com.springlessons.mybusiness.dao.ISecretarioDao;
import com.springlessons.mybusiness.entities.Secretario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class businessController {
    
    @Autowired
    private ISecretarioDao secretarioDao;

    @GetMapping("/")
    public String index(Model model) {
        var listaSecretarios = secretarioDao.findAll();
        model.addAttribute("listaSecretarios", listaSecretarios);
        return "pages/home";
    }
/*
    @GetMapping("/home")
    public String home() {
        return "pages/home";
    }
    
    @GetMapping("/altaSecretario")
    public String altaSecretario() {
        return "pages/altaSecretario";
    }*/
}
