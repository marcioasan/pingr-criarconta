package br.com.marcio.pingr.controller.form;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.marcio.pingr.modelo.Usuario;

public class UsuarioForm {

	@NotNull 
	@NotEmpty
	private String nome;
	
	@NotNull 
	@NotEmpty
	private String email;
	
	@NotNull 
	@NotEmpty
	private String senha;
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario converter() {
		return new Usuario(nome, email, senha);
	}
}
