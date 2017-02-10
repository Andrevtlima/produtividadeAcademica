package pessoa;

import java.util.LinkedList;
import java.util.List;

import producoes.Orientacoes;

public class Professor extends Colaborador {

	public Professor(String idCadastro,String nome, String cpf, String email) {
		super(idCadastro,nome, cpf, email);
		// TODO Auto-generated constructor stub
	}
	private List<Orientacoes> orientacoes = new LinkedList<Orientacoes>();
	public List<Orientacoes> getOrientacoes() {
		return orientacoes;
	}
	public void setOrientacoes(Orientacoes orientacao) {
		this.orientacoes.add(orientacao);
	}
	
}
