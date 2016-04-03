package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.edu.infnet.javainrio.domain.inscricao.AreaInteresse;

@ManagedBean(name = "areasInteresseMB")
@ApplicationScoped
public class AreasInteresseController implements Serializable {

	private static final long serialVersionUID = 1L;

	public SelectItem[] getAreasInteresse() {
		AreaInteresse[] valores = AreaInteresse.values();
		SelectItem[] itens = new SelectItem[valores.length];
		int i = 0;
		for (AreaInteresse area : valores) {
			itens[i++] = new SelectItem(area, area.getRotulo());
		}
		return itens;
	}

}
