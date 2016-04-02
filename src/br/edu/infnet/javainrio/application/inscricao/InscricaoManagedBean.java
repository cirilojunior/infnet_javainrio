package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.infnet.javainrio.infrastructure.inscricao.InscricaoRepositoryJpa;

@ManagedBean(name = "inscricaoMB")
public class InscricaoManagedBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<InscricaoDTO> lista = new ArrayList<>();
	
	InscricaoRepositoryJpa jpa = new InscricaoRepositoryJpa();

	public InscricaoManagedBean(){
		buscarInscritos();
	}
	
	public void buscarInscritos() {
		lista = jpa.listar();
	}
	
	public List<InscricaoDTO> getLista() {
		return lista;
	}
}
