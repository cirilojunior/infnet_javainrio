package br.edu.infnet.javainrio.infrastructure.edicao.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;
import br.edu.infnet.javainrio.domain.comum.Estado;
import br.edu.infnet.javainrio.domain.edicao.Edicao;
import br.edu.infnet.javainrio.domain.edicao.EdicaoRepository;

/**
 * Repositorio em memoria. Nao houve a necessidade de cadastrar em banco ainda,
 * pois e o segundo evento, e primeiro com site, segundo a contextualizacao do trabalho.
 */
public class EdicaoRepositoryInMemory implements EdicaoRepository {

	private static final List<Edicao> edicoes = new ArrayList<>();

	public EdicaoRepositoryInMemory() {
		Endereco local = new Endereco("Rua Java", "100", null, "TIsópolis", "Rio de Janeiro", Estado.RJ, "22222-222");
		Contato contato = new Contato("2371-2212", "contato@javainrio.com.br");

		LocalDate inicioInscricao = LocalDate.of(2011, 3, 1);
		LocalDate fimInscricao = LocalDate.of(2011, 5, 31);
		LocalDate inicioEvento = LocalDate.of(2011, 6, 4);
		LocalDate fimEvento = LocalDate.of(2011, 6, 8);
		edicoes.add(new Edicao(2011, inicioInscricao, fimInscricao, local, contato, inicioEvento, fimEvento));

		inicioInscricao = LocalDate.of(2012, 3, 1);
		fimInscricao = LocalDate.of(2012, 5, 31);
		inicioEvento = LocalDate.of(2012, 6, 4);
		fimEvento = LocalDate.of(2012, 6, 8);
		edicoes.add(new Edicao(2012, inicioInscricao, fimInscricao, local, contato, inicioEvento, fimEvento));
	}

	@Override
	public Edicao recuperar(Integer ano) {
		for (Edicao edicao : edicoes) {
			if (edicao.getAno().equals(ano)) {
				return edicao;
			}
		}
		return null;
	}

}
