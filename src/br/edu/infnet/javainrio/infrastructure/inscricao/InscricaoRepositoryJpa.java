package br.edu.infnet.javainrio.infrastructure.inscricao;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.javainrio.application.inscricao.InscricaoDTO;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;

public class InscricaoRepositoryJpa implements InscricaoRepository {

	@Override
	public void confirmar(Inscricao inscricao) {
		// TODO implementar...
	}
	
	@Override
	public List<InscricaoDTO> listar() {

		return new ArrayList<InscricaoDTO>();
	}

}
