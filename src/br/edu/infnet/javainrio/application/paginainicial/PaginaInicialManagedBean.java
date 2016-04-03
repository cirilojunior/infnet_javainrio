package br.edu.infnet.javainrio.application.paginainicial;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.infnet.javainrio.application.inscricao.InscricaoApplicationService;

@ManagedBean(name = "paginaInicialMB")
@ApplicationScoped
public class PaginaInicialManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB
	private InscricaoApplicationService inscricaoApplicationService;

	public String getValorPorDia() {
		return "R$ " + inscricaoApplicationService.recuperaValorPorDia();
	}

}
