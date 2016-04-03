package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import br.edu.infnet.javainrio.infrastructure.comum.dao.ContatoEntity;
import br.edu.infnet.javainrio.infrastructure.comum.dao.EnderecoEntity;

@Embeddable
public class ParticipanteEntity {

	private String nome;
	private String cpf;
	@Embedded
	private EnderecoEntity endereco;
	@Embedded
	private ContatoEntity contato;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	public ContatoEntity getContato() {
		return contato;
	}

	public void setContato(ContatoEntity contato) {
		this.contato = contato;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
