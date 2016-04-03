package br.edu.infnet.javainrio.infrastructure.inscricao;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.edu.infnet.javainrio.domain.inscricao.DiasEvento;

@ManagedBean(name = "diasEventoMB")
@ApplicationScoped
public class DiasEventoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public SelectItem[] getDiasEvento() {
		DiasEvento[] valores = DiasEvento.values();
		SelectItem[] itens = new SelectItem[valores.length];
		int i = 0;
		for (DiasEvento dias : valores) {
			itens[i++] = new SelectItem(dias, dias.getDiaSemana());
		}
		return itens;
	}

}
