package br.edu.infnet.javainrio.application.acesso;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AcessoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private LoginDTO login;

	public AcessoManagedBean() {
		this.login = new LoginDTO();
	}

	public LoginDTO getLogin() {
		return login;
	}

	public void setLogin(LoginDTO login) {
		this.login = login;
	}

}
