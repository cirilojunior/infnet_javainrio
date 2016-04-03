package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.infnet.javainrio.domain.inscricao.InscricaoRepository;
import br.edu.infnet.javainrio.infrastructure.inscricao.dao.InscricaoRepositoryJpa;

@ManagedBean(name = "inscricaoMB")
@SessionScoped
public class InscricaoController implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<InscricaoDTO> lista = new ArrayList<>();
	private InscricaoDTO inscricao;
	private IngressoDTO ingresso;
	private InscricaoRepository inscricaoRepository = new InscricaoRepositoryJpa();
	@EJB
	private InscricaoApplicationService inscricaoApplicationService;

	public InscricaoController() {
		buscarInscritos();
	}

	// Acoes e EventListeners
	public void buscarInscritos() {
		System.out.println("Buscando inscritos.");
		lista = inscricaoRepository.listar();
	}

	public String iniciarIncricao() {
		System.out.println("Iniciando inscricao.");
		inscricao = new InscricaoDTO();
		ingresso = null;
		return "pages/inscricao/inscricao.xhtml";
	}

	public String efetuarInscricao() {
		System.out.println("Efetuando a inscricao.");
		try {
			ingresso = inscricaoApplicationService.efetuar(inscricao);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Você é mais um nerd que participará do evento!", ""));
			return "confirmacao";
		} catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sua inscrição já foi realizada com sucesso.", ""));
			return "inscricao";
		}
	}

	// Getters e Setters
	public List<InscricaoDTO> getLista() {
		return lista;
	}

	public IngressoDTO getIngresso() {
		return ingresso;
	}

	public InscricaoDTO getInscricao() {
		return inscricao;
	}

	public void setInscricao(InscricaoDTO inscricao) {
		this.inscricao = inscricao;
	}

}
