package br.edu.infnet.javainrio.domain.inscricao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Inscricao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Participante participante;
	private Integer anoEdicao;
	private LocalDate data;
	private BigDecimal valorPago;
	private String codigoIngresso;

	public Inscricao(Participante participante, Integer anoEdicao, LocalDate data, BigDecimal valorPago) {
		this.participante = participante;
		this.anoEdicao = anoEdicao;
		this.data = data;
		this.valorPago = valorPago;

		// Geracao do codigo da inscricao
		this.codigoIngresso = UUID.randomUUID().toString();
	}

	public Participante getParticipante() {
		return participante;
	}

	public Integer getAnoEdicao() {
		return anoEdicao;
	}

	public LocalDate getData() {
		return data;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public String getCodigoIngresso() {
		return codigoIngresso;
	}

}
