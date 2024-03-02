package com.leandro.springcloud.msvc.usuarios.service;

import com.leandro.springcloud.msvc.usuarios.model.entity.Usuario;
import com.leandro.springcloud.msvc.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

  List<Usuario> listar();
  Optional<Usuario> porId(Long id);
  Usuario guardar(Usuario usuario);

  void eliminar(Long id);

}
