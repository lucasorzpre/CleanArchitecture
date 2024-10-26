package com.lucasorpr.clean_arch.infraestrutura.gateway;

import com.lucasorpr.clean_arch.domain.Usuario;
import com.lucasorpr.clean_arch.infraestrutura.persistence.UsuarioEntity;

public class UsuarioMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.username(), usuario.password(), usuario.email());
    }

    public Usuario toDomain(UsuarioEntity entity) {
        return new Usuario(entity.getUsername(), entity.getPassword(), entity.getEmail());
    }

}
