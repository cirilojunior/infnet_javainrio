package br.edu.infnet.javainrio.application.acesso;

import java.io.Serializable;

import br.edu.infnet.javainrio.domain.inscricao.Participante;

public class ParticipanteDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nome;

	public ParticipanteDTO() {
		super();
	}

	public ParticipanteDTO(Participante participante) {
		super();
		this.codigo = participante.getCodigo();
		this.nome = participante.getNome();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdmin() {
		return false;
	}
}
