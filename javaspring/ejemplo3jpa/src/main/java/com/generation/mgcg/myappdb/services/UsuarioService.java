package com.generation.mgcg.myappdb.services;

import com.generation.mgcg.myappdb.models.UsuarioModel;
import com.generation.mgcg.myappdb.models.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList <UsuarioModel> obtenerUsuarios() {
        return (ArrayList <UsuarioModel>) usuarioRepository.findAll();

    }
    public UsuarioModel guardarUsuario (UsuarioModel usuario) {
        return usuarioRepositorio.save(usuario);



    }

    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad")
                                                              Integer prioridad){
        return this.usuarioServicio.obtenerPorPrioridad(prioridad);
    }
    public boolean elimiarUsuario(Long id) {
        try {
            usuarioRepositorio.deleteById(id);
            return true;

        } catch (Exception e) {
            return false;
        }

    }


}
