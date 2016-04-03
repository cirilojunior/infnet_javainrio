package br.edu.infnet.javainrio.domain.pagamento;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import br.edu.infnet.javainrio.domain.inscricao.DiasEvento;

public class Pagamento {

	public enum BandeiraCartao {

		VISA("desconto.visa", "Visa"), 
		MASTERCARD("desconto.mastercard", "MasterCard"), 
		AMERICAN_EXPRESS("desconto.american.express", "American Express");

		private String parametroDesconto;
		private String rotulo;
		
		private BandeiraCartao(String parametroDesconto, String rotulo) {
			this.parametroDesconto = parametroDesconto;
			this.rotulo = rotulo;
		}
		
		public String getRotulo() {
			return rotulo;
		}

	}

	private BandeiraCartao bandeiraCartao;
	private List<DiasEvento> dias;

	public Pagamento(BandeiraCartao bandeiraCartao, List<DiasEvento> dias) {
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

	public List<DiasEvento> getDias() {
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
