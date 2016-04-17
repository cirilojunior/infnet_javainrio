package br.edu.infnet.javainrio.domain.inscricao;

import java.util.List;

public interface InscricaoRepository {

	void confirmar(Inscricao inscricao);

	List<Inscricao> listar();

}
