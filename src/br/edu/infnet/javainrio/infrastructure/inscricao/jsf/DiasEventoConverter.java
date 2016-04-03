package br.edu.infnet.javainrio.infrastructure.inscricao.jsf;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

import br.edu.infnet.javainrio.domain.inscricao.DiasEvento;

@FacesConverter(value = "diasEventoConverter")
public class DiasEventoConverter extends EnumConverter {

	public DiasEventoConverter() {
		super(DiasEvento.class);
	}

}
