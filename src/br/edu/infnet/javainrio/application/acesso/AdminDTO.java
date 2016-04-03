package br.edu.infnet.javainrio.application.acesso;

public class AdminDTO extends ParticipanteDTO {

	private static final long serialVersionUID = 1L;

	public AdminDTO(String nome) {
		super.setNome(nome);
	}

	@Override
	public boolean isAdmin() {
		return true;
	}

}
