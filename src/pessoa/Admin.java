package pessoa;

public class Admin extends Professor {
	private String senha;
	public Admin(String idCadastro, String nome, String cpf, String email, String senha) {
		super(idCadastro, nome, cpf, email);
		this.setSenha(senha);
		// TODO Auto-generated constructor stub
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
