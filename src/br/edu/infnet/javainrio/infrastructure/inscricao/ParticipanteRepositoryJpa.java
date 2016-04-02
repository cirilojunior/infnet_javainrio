package br.edu.infnet.javainrio.infrastructure.inscricao;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

/**
 * Repositorio de Participantes com JPA.
 */
public class ParticipanteRepositoryJpa implements ParticipanteRepository {

	@Override
	public Participante buscarPorUsuarioESenha(String usuario, String senha) {
		System.out.println("Buscando participante por usuario e senha.");
		return null;
	}

	@Override
	public Participante salvar(Participante participante) {
		System.out.println("Salvando partipante.");
		return null;
	}

}
