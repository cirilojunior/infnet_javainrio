package br.edu.infnet.javainrio.domain.inscricao;

public class ParticipanteJaCadastradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ParticipanteJaCadastradoException() {
		super("Participante ja cadastrado.");
	}

}
