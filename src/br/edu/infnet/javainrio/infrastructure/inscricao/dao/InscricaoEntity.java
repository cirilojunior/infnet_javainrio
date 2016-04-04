package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.infnet.javainrio.domain.inscricao.Inscricao;

@Entity
//@Table(schema = "infnet_java_javainrio", name = "inscricao")
@Table(name = "inscricao")
public class InscricaoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Embedded
	private ParticipanteEntity participante;
	private Integer anoEdicao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	private BigDecimal valorPago;
	@Id
	private String codigoIngresso;

	public InscricaoEntity() {
		super();
	}

	public InscricaoEntity(Inscricao inscricao) {
		this();
		this.participante = new ParticipanteEntity(inscricao.getParticipante());
		this.anoEdicao = inscricao.getAnoEdicao();
		this.data = Date.from(inscricao.getData().atStartOfDay(ZoneId.systemDefault()).toInstant());
		this.valorPago = inscricao.getValorPago();
		this.codigoIngresso = inscricao.getCodigoIngresso();
	}

	public ParticipanteEntity getParticipante() {
		return participante;
	}

	public void setParticipante(ParticipanteEntity participante) {
		this.participante = participante;
	}

	public Integer getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(Integer anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public String getCodigoIngresso() {
		return codigoIngresso;
	}

	public void setCodigoIngresso(String codigoIngresso) {
		this.codigoIngresso = codigoIngresso;
	}

}
