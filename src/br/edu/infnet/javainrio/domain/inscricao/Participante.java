package br.edu.infnet.javainrio.domain.inscricao;

import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;

public class Participante {

	private Integer codigo;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private Contato contato;
	private String senha;

	public Participante(Integer codigo, String nome, String cpf, Endereco endereco, Contato contato, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contato = contato;
		this.senha = senha;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
