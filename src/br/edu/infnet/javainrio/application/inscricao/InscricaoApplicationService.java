package br.edu.infnet.javainrio.application.inscricao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javax.ejb.Stateless;

import br.edu.infnet.javainrio.domain.comum.Constantes;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;
import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteJaCadastradoException;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;
import br.edu.infnet.javainrio.infrastructure.inscricao.dao.InscricaoRepositoryJpa;
import br.edu.infnet.javainrio.infrastructure.inscricao.dao.ParticipanteRepositoryJpa;

@Stateless
public class InscricaoApplicationService {

	private ParticipanteRepository participanteRepository = new ParticipanteRepositoryJpa();
	private InscricaoRepository inscricaoRepository = new InscricaoRepositoryJpa();

	public IngressoDTO efetuar(InscricaoDTO dto) {

		LocalDate hoje = LocalDate.now();
		Integer anoEdicao = hoje.getYear();
		BigDecimal valorPorDiaDoEvento = recuperaValorPorDia();

		BigDecimal valorPagamento = dto.toPagamento().calcularTotal(valorPorDiaDoEvento);

		Participante participante = dto.toParticipante();
		
		if(participanteRepository.buscar(participante.getCpf()) != null) {
			throw new ParticipanteJaCadastradoException();
		}
		
		Participante participanteGravado = participanteRepository.salvar(participante);

		Inscricao inscricao = new Inscricao(participanteGravado, anoEdicao, hoje, valorPagamento);

		inscricaoRepository.confirmar(inscricao);

		IngressoDTO ingresso = new IngressoDTO();
		ingresso.setCodigoIngresso(inscricao.getCodigoIngresso());
		ingresso.setData(hoje.format(Constantes.FORMATADOR_DATAS));
		ingresso.setNomeParticipante(participanteGravado.getNome());
		ingresso.setValorTotal(valorPagamento.toString());

		return ingresso;
	}

	public BigDecimal recuperaValorPorDia() {
		ResourceBundle parametros = ResourceBundle.getBundle("parametros");
		return new BigDecimal(parametros.getString("valor.dia"));
	}

}
