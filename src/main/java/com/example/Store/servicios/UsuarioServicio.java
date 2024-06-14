package com.example.Store.servicios;


import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {


    @Autowired
    UsuarioRepositorio usuarioRepositorio;



    //guardar un usuario
    public Usuario guardarUsuario(Usuario datosUsuario) throws Exception{
        try{
            return usuarioRepositorio.save(datosUsuario);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //consultar un usuario en bd por ID
    public Usuario buscarUsuarioPorId(Integer idUsuario) throws Exception{
        try{

            if(usuarioRepositorio.findById(idUsuario).isPresent()){
                return usuarioRepositorio.findById(idUsuario).get();
            }else{
                throw new Exception("Usuario no encontrado");
            }

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


    //consultar todos los usuarios
    public List<Usuario> buscarTodosUsuarios() throws Exception{
        try{
            return usuarioRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }



}
