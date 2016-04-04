package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

/**
 * Repositorio de Participantes com JPA.
 */
@Stateless
public class ParticipanteRepositoryJpa implements ParticipanteRepository {

	private static List<Participante> participantes = new ArrayList<>();

	public ParticipanteRepositoryJpa() {
		participantes.add(new Participante("Administrador", "admin", null, null, "admin"));
	}

	@Override
	public Participante buscar(String usuario) {
		System.out.println("Buscando participante por usuario(cpf).");

		for (Participante p : participantes) {
			if (p.getCpf().equals(usuario)) {
				return p;
			}
		}

		return null;
	}

	@Override
	public Participante verificar(String usuario, String senha) {
		System.out.println("Verificando existencia do participante por usuario e senha.");

		for (Participante p : participantes) {
			if (p.getCpf().equals(usuario) && p.getSenha().equals(senha)) {
				return p;
			}
		}

		return null;
	}

	@Override
	public Participante salvar(Participante participante) {
		System.out.println("Salvando partipante.");
		if (participantes.contains(participante)) {
			return null;
		}

		Participante gravado = new Participante(participante.getNome(), participante.getCpf(),
				participante.getEndereco(), participante.getContato(), participante.getSenha());
		participantes.add(gravado);
		return gravado;
	}

}
