package br.edu.infnet.javainrio.infrastructure.comum.dao;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.edu.infnet.javainrio.domain.comum.Endereco;
import br.edu.infnet.javainrio.domain.comum.Estado;

@Embeddable
public class EnderecoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	@Enumerated(EnumType.STRING)
	private Estado estado;
	private String cep;

	public EnderecoEntity() {
		super();
	}

	public EnderecoEntity(Endereco endereco) {
		this();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.estado = endereco.getEstado();
		this.cep = endereco.getCep();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Endereco toDomain() {
		return new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
	}

}
