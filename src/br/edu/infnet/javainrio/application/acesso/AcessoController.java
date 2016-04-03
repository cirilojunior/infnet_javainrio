package br.edu.infnet.javainrio.application.acesso;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "acessoMB")
@SessionScoped
public class AcessoController implements Serializable {

	private static final long serialVersionUID = 1L;
	private LoginDTO login;

	public AcessoController() {
		this.login = new LoginDTO();
	}

	public String efetuarLogin(){
		if(login.getUsuario().equals("admin") && login.getSenha().equals("admin")){
			return "pages/autenticado/main.xhtml";
		}
		
		return "index";
	}
	
	public LoginDTO getLogin() {
		return login;
	}

	public void setLogin(LoginDTO login) {
		this.login = login;
	}

}
