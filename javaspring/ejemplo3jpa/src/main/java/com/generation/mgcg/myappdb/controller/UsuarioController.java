package com.generation.mgcg.myappdb.controller;


import com.generation.mgcg.myappdb.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioServicio;
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioServicio.obtenerUsuarios();

    }
@PostMapping()
    public UsuarioModel guardarUSuario(@RequestBody UsuarioModel usuario){
        return this.usuarioServicio.guardarUsuario(usuario);
}




}
