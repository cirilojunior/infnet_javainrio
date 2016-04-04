package br.edu.infnet.javainrio.application.inscricao;

import java.io.Serializable;
import java.util.List;

import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;
import br.edu.infnet.javainrio.domain.comum.Estado;
import br.edu.infnet.javainrio.domain.inscricao.AreaInteresse;
import br.edu.infnet.javainrio.domain.inscricao.DiasEvento;
import br.edu.infnet.javainrio.domain.inscricao.Inscricao;
import br.edu.infnet.javainrio.domain.inscricao.Participante;
import br.edu.infnet.javainrio.domain.pagamento.Pagamento;

public class InscricaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	// Participante
	private String nome;
	private String cpf;
	private String senha;
	private List<AreaInteresse> areasInteresse;

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
	private List<DiasEvento> diasSelecionados;
	private Pagamento.BandeiraCartao bandeiraCartao;

	public InscricaoDTO() {
		super();
	}

	public InscricaoDTO(Inscricao inscricao) {
		this();
		this.nome = inscricao.getParticipante().getNome();
		this.cpf = inscricao.getParticipante().getCpf();

		this.telefone = inscricao.getParticipante().getContato().getTelefone();
		this.email = inscricao.getParticipante().getContato().getEmail();

		this.logradouro = inscricao.getParticipante().getEndereco().getLogradouro();
		this.numero = inscricao.getParticipante().getEndereco().getNumero();
		this.complemento = inscricao.getParticipante().getEndereco().getComplemento();
		this.bairro = inscricao.getParticipante().getEndereco().getBairro();
		this.cidade = inscricao.getParticipante().getEndereco().getCidade();
		this.estado = inscricao.getParticipante().getEndereco().getEstado().toString();
		this.cep = inscricao.getParticipante().getEndereco().getCep();

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<AreaInteresse> getAreasInteresse() {
		return areasInteresse;
	}

	public void setAreasInteresse(List<AreaInteresse> areasInteresse) {
		this.areasInteresse = areasInteresse;
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

	public List<DiasEvento> getDiasSelecionados() {
		return diasSelecionados;
	}

	public void setDiasSelecionados(List<DiasEvento> diasSelecionados) {
		this.diasSelecionados = diasSelecionados;
	}

	public Pagamento.BandeiraCartao getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(Pagamento.BandeiraCartao bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public Contato toContato() {
		return new Contato(telefone, email);
	}

	public Endereco toEnredeco() {
		return new Endereco(logradouro, numero, complemento, bairro, cidade, Estado.valueOf(estado), cep);
	}

	public Pagamento toPagamento() {
		return new Pagamento(bandeiraCartao, diasSelecionados);
	}

	public Participante toParticipante() {
		return new Participante(nome, cpf, toEnredeco(), toContato(), senha);
	}

}
