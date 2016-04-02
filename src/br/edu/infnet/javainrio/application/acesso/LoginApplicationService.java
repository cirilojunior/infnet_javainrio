package br.edu.infnet.javainrio.application.acesso;

import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

@Stateless
public class LoginApplicationService {

	private ParticipanteRepository participanteRepository;

	public ParticipanteDTO login(LoginDTO login) {

		if (StringUtils.isBlank(login.getUsuario())) {
			throw new IllegalArgumentException("Usuario nao informado.");
		}

		if (StringUtils.isBlank(login.getSenha())) {
			throw new IllegalArgumentException("Senha nao informada.");
		}

		Participante participante = participanteRepository.verificar(login.getUsuario(), login.getSenha());

		return new ParticipanteDTO(participante);

	}

}
