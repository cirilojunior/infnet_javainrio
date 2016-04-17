package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;

/**
 * Repositorio de Inscricoes com JPA.
 */
@Stateless
@Remote(InscricaoRepository.class)
public class InscricaoRepositoryJpa implements InscricaoRepository {

	@PersistenceContext(name = "javainrio")
	private EntityManager em;

	@Override
	public void confirmar(Inscricao inscricao) {
		System.out.println("Confirmando inscricao.");

		InscricaoEntity entity = new InscricaoEntity(inscricao);
		em.persist(entity);
	}

	@Override
	public List<Inscricao> listar() {
		System.out.println("Listando inscricoes.");

		CriteriaQuery<InscricaoEntity> cq = em.getCriteriaBuilder().createQuery(InscricaoEntity.class);
		cq.select(cq.from(InscricaoEntity.class));
		List<InscricaoEntity> entities = (List<InscricaoEntity>) em.createQuery(cq).getResultList();

		List<Inscricao> inscricoes = new ArrayList<>();
		for (InscricaoEntity entity : entities) {
			inscricoes.add(entity.toDomain());
		}
		return inscricoes;
	}

}
