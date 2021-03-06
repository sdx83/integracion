package com.sso.springboot.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>  {

	Optional<Usuario> findByUsuarioAndPassword(String usuario,String password);


	Usuario findByUsuario(String user);
}