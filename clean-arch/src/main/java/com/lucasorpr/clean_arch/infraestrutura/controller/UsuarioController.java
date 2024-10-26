package com.lucasorpr.clean_arch.infraestrutura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasorpr.clean_arch.application.usecase.UsuarioInteractor;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    UsuarioInteractor usuarioInteractor;

    @Autowired
    UsuarioDtoMapper mapper;

    @PostMapping("/novo")
    public UsuarioResponse salva(@RequestBody UsuarioRequest usuarioRequest) {

        usuarioInteractor.createUsuario();

    }

}
