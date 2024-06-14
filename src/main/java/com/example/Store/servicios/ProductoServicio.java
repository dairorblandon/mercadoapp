package com.example.Store.servicios;

import com.example.Store.modelos.Producto;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.ProductoRepositorio;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    ProductoRepositorio productoRepositorio;

    public Producto guardarProducto(Producto datosProducto) throws Exception{
        try{
            return productoRepositorio.save(datosProducto);

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Producto> buscarTodosProductos() throws Exception{
        try{
            return productoRepositorio.findAll();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
