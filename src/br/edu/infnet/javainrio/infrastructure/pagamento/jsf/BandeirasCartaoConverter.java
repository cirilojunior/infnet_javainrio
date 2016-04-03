package br.edu.infnet.javainrio.infrastructure.pagamento.jsf;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

import br.edu.infnet.javainrio.domain.pagamento.Pagamento;

@FacesConverter(value = "bandeirasCartaoConverter")
public class BandeirasCartaoConverter extends EnumConverter {

	public BandeirasCartaoConverter() {
		super(Pagamento.BandeiraCartao.class);
	}
}
