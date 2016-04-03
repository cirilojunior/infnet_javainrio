package br.edu.infnet.javainrio.application.acesso;

import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;
import br.edu.infnet.javainrio.infrastructure.inscricao.dao.ParticipanteRepositoryJpa;

@Stateless
public class LoginApplicationService {

	private ParticipanteRepository participanteRepository = new ParticipanteRepositoryJpa();

	public ParticipanteDTO login(String login, String senha) {

		if (StringUtils.isBlank(login)) {
			throw new IllegalArgumentException("Usuario nao informado.");
		}

		if (StringUtils.isBlank(senha)) {
			throw new IllegalArgumentException("Senha nao informada.");
		}

		Participante participante = participanteRepository.verificar(login, senha);

		if (participante == null) {
			throw new AcessoException();
		}
		
		if (login.equals("admin")) {
			return new AdminDTO(participante.getNome());
		}

		return new ParticipanteDTO(participante);

	}

}
