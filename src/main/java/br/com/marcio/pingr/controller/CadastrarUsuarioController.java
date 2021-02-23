package br.com.marcio.pingr.controller;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.marcio.pingr.controller.dto.UsuarioDto;
import br.com.marcio.pingr.controller.form.UsuarioForm;
import br.com.marcio.pingr.modelo.Usuario;
import br.com.marcio.pingr.repository.UsuarioRepository;

@RestController
@RequestMapping("/cadastrar")
public class CadastrarUsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity<UsuarioDto> cadastrar(@RequestBody @Valid UsuarioForm form, UriComponentsBuilder uriBuilder){
		
		Usuario usuario = form.converter();
		usuario.setSenha(new BCryptPasswordEncoder().encode(form.getSenha()));
		
		usuarioRepository.save(usuario);
		
		URI uri = uriBuilder.path("/usuario/{id}").buildAndExpand(usuario.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
	}
}
