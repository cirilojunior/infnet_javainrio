package br.edu.infnet.javainrio.domain.inscricao;

import java.util.List;

import br.edu.infnet.javainrio.application.inscricao.InscricaoDTO;

public interface InscricaoRepository {
	
	void confirmar(Inscricao inscricao);
	
	List<InscricaoDTO> listar();

}
