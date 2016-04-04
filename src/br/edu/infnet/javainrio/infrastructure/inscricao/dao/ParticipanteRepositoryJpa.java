package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

/**
 * Repositorio de Participantes com JPA.
 */
@Stateless
public class ParticipanteRepositoryJpa implements ParticipanteRepository {

	@PersistenceContext(name = "javainrio")
	private EntityManager em;

	@Override
	public Participante buscar(String usuario) {
		System.out.println("Buscando participante por usuario(cpf).");

		TypedQuery<InscricaoEntity> query = em.createQuery(
				"SELECT i FROM InscricaoEntity i WHERE i.participante.cpf = " + usuario, InscricaoEntity.class);
		List<InscricaoEntity> resultado = query.getResultList();
		if (resultado.isEmpty()) {
			return null;
		}

		return resultado.get(0).getParticipante().toDomain();

	}

	@Override
	public Participante verificar(String usuario, String senha) {
		System.out.println("Buscando participante por usuario(cpf) e senha.");

		TypedQuery<InscricaoEntity> query = em
				.createQuery("SELECT i FROM InscricaoEntity i WHERE i.participante.cpf = '" + usuario
						+ "' and senha = '" + senha + "'", InscricaoEntity.class);
		List<InscricaoEntity> resultado = query.getResultList();
		if (resultado.isEmpty()) {
			return null;
		}

		return resultado.get(0).getParticipante().toDomain();

	}

}
