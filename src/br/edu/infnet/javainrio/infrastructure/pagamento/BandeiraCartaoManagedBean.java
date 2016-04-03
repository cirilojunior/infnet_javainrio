package br.edu.infnet.javainrio.infrastructure.pagamento;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import br.edu.infnet.javainrio.domain.pagamento.Pagamento;

@ManagedBean(name = "bandeirasCartaoMB")
@ApplicationScoped
public class BandeiraCartaoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public SelectItem[] getBandeirasCartao() {
		Pagamento.BandeiraCartao[] valores = Pagamento.BandeiraCartao.values();
		SelectItem[] itens = new SelectItem[valores.length];
		int i = 0;
		for (Pagamento.BandeiraCartao bandeira : valores) {
			itens[i++] = new SelectItem(bandeira, bandeira.getRotulo());
		}
		return itens;
	}

}
