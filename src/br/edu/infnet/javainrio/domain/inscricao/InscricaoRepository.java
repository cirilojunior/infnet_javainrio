package br.edu.infnet.javainrio.domain.inscricao;

import java.util.List;

import javax.ejb.Remote;

import br.edu.infnet.javainrio.application.inscricao.InscricaoDTO;

@Remote
public interface InscricaoRepository {
	
	void confirmar(Inscricao inscricao);
	
	List<InscricaoDTO> listar();

}
