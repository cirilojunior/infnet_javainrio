package br.edu.infnet.javainrio.domain.inscricao;

public interface ParticipanteRepository {

	Participante buscar(String usuario);
	
	Participante verificar(String usuario, String senha);

	Participante salvar(Participante participante);

}
