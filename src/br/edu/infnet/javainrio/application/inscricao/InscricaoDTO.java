package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.javainrio.domain.comum.Constantes;
import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;
import br.edu.infnet.javainrio.domain.comum.Estado;
import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.pagamento.Pagamento;
import br.edu.infnet.javainrio.domain.pagamento.Pagamento.BandeiraCartao;

public class InscricaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// Participante
	private String codigo;
	private String nome;
	private String cpf;
	private List<String> areasInteresses;

	// Contato
	private String telefone;
	private String email;

	// Endereco
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	// Pagamento
	private List<String> diasSelecionados;
	private String bandeiraCartao;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<String> getAreasInteresses() {
		return areasInteresses;
	}

	public void setAreasInteresses(List<String> areasInteresses) {
		this.areasInteresses = areasInteresses;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public List<String> getDiasSelecionados() {
		return diasSelecionados;
	}

	public void setDiasSelecionados(List<String> diasSelecionados) {
		this.diasSelecionados = diasSelecionados;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public Contato toContato() {
		return new Contato(telefone, email);
	}

	public Endereco toEnredeco() {
		return new Endereco(logradouro, numero, complemento, bairro, cidade, Estado.valueOf(estado), cep);
	}

	public Pagamento toPagamento() {
		List<LocalDate> datas = new ArrayList<>();
		for (String data : diasSelecionados) {
			datas.add(LocalDate.parse(data, Constantes.FORMATADOR_DATAS));
		}

		return new Pagamento(BandeiraCartao.valueOf(bandeiraCartao), datas);
	}

	public Participante toParticipante() {
		return new Participante(null, nome, cpf, toEnredeco(), toContato());
	}

}
