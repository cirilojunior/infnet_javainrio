package br.edu.infnet.javainrio.domain.inscricao;

public interface ParticipanteRepository {

	Participante buscarPorUsuarioESenha(String usuario, String senha);

	Participante salvar(Participante participante);

}
