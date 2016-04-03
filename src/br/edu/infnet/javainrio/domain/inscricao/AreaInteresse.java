package br.edu.infnet.javainrio.domain.inscricao;

public enum AreaInteresse {

	DESKTOP("Desktop Development"), 
	WEB("Web Development"), 
	ENTERPRISE("Enterprise Development"), 
	FRAMEWORKS("Useful frameworks and Framework Development"), 
	APPLICATION_SERVERS("Application Servers"), 
	SPECIFICATION("Java Specification");
	
	private String rotulo;
	
	private AreaInteresse(String rotulo) {
		this.rotulo = rotulo;
	}
	
	public String getRotulo() {
		return rotulo;
	}

}
