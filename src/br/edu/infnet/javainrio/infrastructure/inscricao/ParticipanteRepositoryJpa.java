package br.edu.infnet.javainrio.infrastructure.inscricao;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

/**
 * Repositorio de Participantes com JPA.
 */
public class ParticipanteRepositoryJpa implements ParticipanteRepository {

	private static List<Participante> participantes = new ArrayList<>();
	private static int ID_COUNTER = 0;

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

		Participante gravado = new Participante(++ID_COUNTER, participante.getNome(), participante.getCpf(),
				participante.getEndereco(), participante.getContato(), participante.getSenha());
		participantes.add(gravado);
		return gravado;
	}

}
