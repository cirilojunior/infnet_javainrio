package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.infnet.javainrio.application.inscricao.InscricaoDTO;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;

/**
 * Repositorio de Inscricoes com JPA.
 */
@Stateless
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
	public List<InscricaoDTO> listar() {
		System.out.println("Listando inscricoes.");
		ArrayList<InscricaoDTO> lInscricao = new ArrayList<InscricaoDTO>();
		InscricaoDTO inscricao = new InscricaoDTO();

		inscricao.setEmail("pedro@gmail.com");
		inscricao.setNome("pedro");
		inscricao.setCpf("12212222222");

		lInscricao.add(inscricao);

		inscricao = new InscricaoDTO();

		inscricao.setEmail("eduardo@gmail.com");
		inscricao.setNome("eduardo");
		inscricao.setCpf("121313131313");

		lInscricao.add(inscricao);

		inscricao = new InscricaoDTO();

		inscricao.setEmail("cirilo@gmail.com");
		inscricao.setNome("cirilo");
		inscricao.setCpf("12212222222");

		lInscricao.add(inscricao);

		return lInscricao;
	}

}
