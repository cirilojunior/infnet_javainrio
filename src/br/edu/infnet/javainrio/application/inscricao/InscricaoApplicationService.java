package br.edu.infnet.javainrio.application.inscricao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.infnet.javainrio.domain.comum.Constantes;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;
import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteJaCadastradoException;
import br.edu.infnet.javainrio.domain.inscricao.ParticipanteRepository;

@Stateless
public class InscricaoApplicationService {

	@EJB
	private ParticipanteRepository participanteRepository;
	@EJB
	private InscricaoRepository inscricaoRepository;

	public IngressoDTO efetuar(InscricaoDTO dto) {

		LocalDate hoje = LocalDate.now();
		Integer anoEdicao = hoje.getYear();
		BigDecimal valorPorDiaDoEvento = recuperaValorPorDia();

		BigDecimal valorPagamento = dto.toPagamento().calcularTotal(valorPorDiaDoEvento);

		Participante participante = dto.toParticipante();

		if (participanteRepository.buscar(participante.getCpf()) != null) {
			throw new ParticipanteJaCadastradoException();
		}

		Inscricao inscricao = new Inscricao(participante, anoEdicao, hoje, valorPagamento);

		inscricaoRepository.confirmar(inscricao);

		IngressoDTO ingresso = new IngressoDTO();
		ingresso.setCodigoIngresso(inscricao.getCodigoIngresso());
		ingresso.setData(hoje.format(Constantes.FORMATADOR_DATAS));
		ingresso.setNomeParticipante(participante.getNome());
		ingresso.setValorTotal(valorPagamento.toString());

		return ingresso;
	}

	public BigDecimal recuperaValorPorDia() {
		ResourceBundle parametros = ResourceBundle.getBundle("parametros");
		return new BigDecimal(parametros.getString("valor.dia"));
	}

}
