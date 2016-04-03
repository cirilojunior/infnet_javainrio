package br.edu.infnet.javainrio.application.acesso;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "acessoMB")
@SessionScoped
public class AcessoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private LoginDTO login;
	private ParticipanteDTO participante;
	@EJB
	private LoginApplicationService loginApplicationService;

	@PostConstruct
	public void init() {
		this.login = new LoginDTO();
	}

	public String efetuarLogin() {

		try {
			participante = loginApplicationService.login(login.getUsuario(), login.getSenha());
			init();
			return "pages/autenticado/main.xhtml";

		} catch (Exception e) {
			participante = null;
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuário e/ou senha inválidos.", ""));
			return "index.xhtml";
		}

	}

	public LoginDTO getLogin() {
		return login;
	}

	public void setLogin(LoginDTO login) {
		this.login = login;
	}
	
	public ParticipanteDTO getParticipante() {
		return participante;
	}

}
