package br.edu.infnet.javainrio.infrastructure.comum.dao;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ContatoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String telefone;
	private String email;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
