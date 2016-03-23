package br.edu.infnet.javainrio.domain.inscricao;

import br.edu.infnet.javainrio.domain.comum.Contato;
import br.edu.infnet.javainrio.domain.comum.Endereco;

public class Participante {

    private Integer codigo;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Contato contato;

    public Participante(Integer codigo, String nome, String cpf, Endereco endereco, Contato contato) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }
}
