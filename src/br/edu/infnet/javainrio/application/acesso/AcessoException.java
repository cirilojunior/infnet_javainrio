package br.edu.infnet.javainrio.application.acesso;

public class AcessoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AcessoException() {
		super("Usuario nao encontrado.");
	}

}
