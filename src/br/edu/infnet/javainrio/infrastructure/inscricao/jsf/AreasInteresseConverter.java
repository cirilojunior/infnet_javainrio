package br.edu.infnet.javainrio.infrastructure.inscricao.jsf;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

import br.edu.infnet.javainrio.domain.inscricao.AreaInteresse;

@FacesConverter(value = "areasInteresseConverter")
public class AreasInteresseConverter extends EnumConverter {

	public AreasInteresseConverter() {
		super(AreaInteresse.class);
	}

}
