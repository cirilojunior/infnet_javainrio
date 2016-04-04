package br.edu.infnet.javainrio.domain.edicao;

import java.io.Serializable;
import java.time.LocalDate;

import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;

public class Edicao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ano;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Endereco local;
	private Contato contato;
	private LocalDate dataInicioInscricao;
	private LocalDate dataFimInscricao;

	public Edicao(Integer ano, LocalDate dataInicio, LocalDate dataFim, Endereco local, Contato contato,
			LocalDate dataInicioInscricao, LocalDate dataFimInscricao) {
		super();
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.local = local;
		this.contato = contato;
		this.dataInicioInscricao = dataInicioInscricao;
		this.dataFimInscricao = dataFimInscricao;
	}

	public Integer getAno() {
		return ano;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public Endereco getLocal() {
		return local;
	}

	public Contato getContato() {
		return contato;
	}

	public LocalDate getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public LocalDate getDataFimInscricao() {
		return dataFimInscricao;
	}

	public boolean isInscricoesAbertas() {
		LocalDate hoje = LocalDate.now();

		if (hoje.isEqual(dataInicioInscricao) || hoje.isEqual(dataFimInscricao)
				|| (hoje.isAfter(dataInicioInscricao) && hoje.isBefore(dataFimInscricao))) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
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
		Edicao other = (Edicao) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		return true;
	}

}
