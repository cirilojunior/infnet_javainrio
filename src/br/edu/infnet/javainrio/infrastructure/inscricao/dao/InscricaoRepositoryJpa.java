package br.edu.infnet.javainrio.infrastructure.inscricao.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.javainrio.application.inscricao.InscricaoDTO;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;

public class InscricaoRepositoryJpa implements InscricaoRepository {

	@Override
	public void confirmar(Inscricao inscricao) {
		System.out.println("Confirmando inscricao.");
	}
	
	@Override
	public List<InscricaoDTO> listar() {
		System.out.println("Listando inscricoes.");
		return new ArrayList<InscricaoDTO>();
	}

}
