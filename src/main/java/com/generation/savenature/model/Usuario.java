package com.generation.savenature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")


public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O campo Nome é Obrigatório!")
	private String nome;

	@NotBlank(message = "O camopo Usuário é Obrigatório!")
	@Email(message = "Usuário deve ser um email válido!")
	private String usuario;

	@NotNull(message = "O campo Senha é Obrigatório!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private Long senha;
	
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Long getSenha() {
		return senha;
	}

	public void setSenha(Long senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	

}
