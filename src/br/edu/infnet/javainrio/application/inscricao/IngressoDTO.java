package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;

public class IngressoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigoIngresso;
	private String nomeParticipante;
	private String data;
	private String valorTotal;

	public String getCodigoIngresso() {
		return codigoIngresso;
	}

	public void setCodigoIngresso(String codigoIngresso) {
		this.codigoIngresso = codigoIngresso;
	}

	public String getNomeParticipante() {
		return nomeParticipante;
	}

	public void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

}
