package com.mainsoft.carrito.model.service;


import com.mainsoft.carrito.model.entity.Usuario;

public interface IUsuarioService {


    //una opción para realizar una consulta con JPQL
    public Usuario findByUsername(String username);
}