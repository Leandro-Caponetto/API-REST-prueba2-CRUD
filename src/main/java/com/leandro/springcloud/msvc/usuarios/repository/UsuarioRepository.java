package com.leandro.springcloud.msvc.usuarios.repository;

import com.leandro.springcloud.msvc.usuarios.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
