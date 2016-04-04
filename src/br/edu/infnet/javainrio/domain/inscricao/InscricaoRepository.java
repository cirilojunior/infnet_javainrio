package br.edu.infnet.javainrio.domain.inscricao;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface InscricaoRepository {

	void confirmar(Inscricao inscricao);

	List<Inscricao> listar();

}
