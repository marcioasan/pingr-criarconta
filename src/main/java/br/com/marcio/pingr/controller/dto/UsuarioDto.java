package br.com.marcio.pingr.controller.dto;

import br.com.marcio.pingr.modelo.Usuario;

public class UsuarioDto {

	private String nome;
	private String email;

	public UsuarioDto(Usuario usuario) {
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
