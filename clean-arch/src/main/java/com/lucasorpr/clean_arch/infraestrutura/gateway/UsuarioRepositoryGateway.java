package com.lucasorpr.clean_arch.infraestrutura.gateway;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucasorpr.clean_arch.application.gateway.UsuarioGateway;
import com.lucasorpr.clean_arch.domain.Usuario;
import com.lucasorpr.clean_arch.infraestrutura.persistence.UsuarioRepository;

public class UsuarioRepositoryGateway implements UsuarioGateway {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public Usuario createUsuario(Usuario usuario) {

        return mapper.toDomain(repository.save(mapper.toEntity(usuario)));

    }

}