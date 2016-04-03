package br.edu.infnet.javainrio.domain.inscricao;

public enum DiasEvento {
	
	DIA_1("Segunda-feira"),
	DIA_2("Terça-feira"),
	DIA_3("Quarta-feira"),
	DIA_4("Quinta-feira"),
	DIA_5("Sexta-feira");
	
	private String diaSemana;
	
	private DiasEvento(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public String getDiaSemana() {
		return diaSemana;
	}

}
