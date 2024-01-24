package com.taller.mecanico.web.tallermecanico.controllers;


import com.taller.mecanico.web.tallermecanico.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String usuario(Model model,@RequestParam String nombre,String rol, int cedula) {
        Usuario user = new Usuario(nombre,rol,cedula);
        model.addAttribute("usuario", user);
        return "usuario";
    }
    
    @GetMapping("/index")
    public String usuario() {
        return "index";
    }
}
