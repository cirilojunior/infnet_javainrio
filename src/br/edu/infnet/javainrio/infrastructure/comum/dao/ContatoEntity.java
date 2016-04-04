package br.edu.infnet.javainrio.infrastructure.comum.dao;

import java.io.Serializable;

import javax.persistence.Embeddable;

import br.edu.infnet.javainrio.domain.comum.Contato;

@Embeddable
public class ContatoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String telefone;
	private String email;

	public ContatoEntity() {
		super();
	}

	public ContatoEntity(Contato contato) {
		this();
		this.telefone = contato.getTelefone();
		this.email = contato.getEmail();
	}

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
	
	public Contato toDomain() {
		return new Contato(telefone, email);
	}

}
