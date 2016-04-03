package br.edu.infnet.javainrio.infrastructure.comum;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

import br.edu.infnet.javainrio.domain.comum.Estado;

@FacesConverter(value = "estadoConverter")
public class EstadoEnumConverter extends EnumConverter {

	public EstadoEnumConverter() {
		super(Estado.class);
	}

}
