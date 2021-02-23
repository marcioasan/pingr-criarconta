package br.com.marcio.pingr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcio.pingr.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String email);
}
