package br.edu.infnet.javainrio.infrastructure.comum;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.edu.infnet.javainrio.domain.comum.Estado;

@ManagedBean(name = "estadosMB")
@ApplicationScoped
public class EstadoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public SelectItem[] getEstados() {
		Estado[] valores = Estado.values();
		SelectItem[] itens = new SelectItem[valores.length];
		int i = 0;
		for (Estado estado : valores) {
			itens[i++] = new SelectItem(estado, estado.toString());
		}
		return itens;
	}

}
