package br.edu.infnet.javainrio.domain.inscricao;

import javax.ejb.Remote;

@Remote
public interface ParticipanteRepository {

	Participante buscar(String usuario);

	Participante verificar(String usuario, String senha);

}
