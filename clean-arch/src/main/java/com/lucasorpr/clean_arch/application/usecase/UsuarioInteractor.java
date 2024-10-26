package com.lucasorpr.clean_arch.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucasorpr.clean_arch.application.gateway.UsuarioGateway;
import com.lucasorpr.clean_arch.domain.Usuario;

public class UsuarioInteractor {

    @Autowired
    UsuarioGateway gateway;

    public Usuario createUsuario(Usuario usuario) {
        return gateway.createUsuario(usuario);
    }

}
