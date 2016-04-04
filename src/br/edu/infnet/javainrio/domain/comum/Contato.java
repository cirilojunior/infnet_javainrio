package br.edu.infnet.javainrio.domain.comum;

import java.io.Serializable;

public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;
	private String telefone;
	private String email;

	public Contato(String telefone, String email) {
		this.telefone = telefone;
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}
}
