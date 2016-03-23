package br.edu.infnet.javainrio.domain.pagamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class Pagamento {

	public enum BandeiraCartao {

		VISA("desconto.visa"), 
		MASTERCARD("desconto.mastercard"), 
		AMERICAN_EXPRESS("desconto.american.express");

		private BandeiraCartao(String parametroDesconto) {
			this.parametroDesconto = parametroDesconto;
		}

		String parametroDesconto;

	}

	private BandeiraCartao bandeiraCartao;
	private List<LocalDate> dias;

	public Pagamento(BandeiraCartao bandeiraCartao, List<LocalDate> dias) {
		if (bandeiraCartao == null) {
			throw new IllegalArgumentException("Bandeira do cartao nao informada.");
		}

		if (dias == null || dias.isEmpty()) {
			throw new IllegalArgumentException("Nao foram selecionados os dias do evento.");
		}

		this.bandeiraCartao = bandeiraCartao;
		this.dias = dias;
	}

	public BandeiraCartao getBandeiraCartao() {
		return bandeiraCartao;
	}

	public List<LocalDate> getDias() {
		return Collections.unmodifiableList(dias);
	}

	public BigDecimal calcularTotal(BigDecimal valorPorDia) {
		if (valorPorDia == null) {
			throw new IllegalArgumentException("Valor por dia nao informado.");
		}

		BigDecimal fatorDesconto = recuperaFatorDeDesconto(bandeiraCartao.parametroDesconto);
		
		BigDecimal valorPorDiaFInal = valorPorDia.multiply(fatorDesconto);
		BigDecimal totalDeDias = new BigDecimal(dias.size());

		return valorPorDiaFInal.multiply(totalDeDias);
	}
	
	private BigDecimal recuperaFatorDeDesconto(String parametroDesconto) {
		ResourceBundle parametros = ResourceBundle.getBundle("parametros");
		return new BigDecimal(parametros.getString(parametroDesconto));
	}

}
