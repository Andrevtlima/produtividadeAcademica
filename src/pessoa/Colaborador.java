package pessoa;

public class Colaborador extends Pessoa {
	private String idCadastro;

	protected String getidCadastro() {
		return idCadastro;
	}

	protected void setId_cadastro(String idCadastro) {
		this.idCadastro = idCadastro;
	}

	public Colaborador(String idCadastro, String nome, String cpf, String email) {
		super(nome, cpf, email);
		this.idCadastro = idCadastro;
	}
	 

}
