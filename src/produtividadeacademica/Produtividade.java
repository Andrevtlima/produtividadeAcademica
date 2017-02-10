package produtividadeacademica;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import pessoa.Admin;
import projetos.Projeto;

public class Produtividade {
	private Scanner scanner = new Scanner(System.in);
	Admin admin = null;
	
	public String getName() throws NoSuchElementException{
		System.out.println("Digite o nome:\n");
		String name = scanner.nextLine();
		return name;
	}
	public String getId() throws NoSuchElementException{
		System.out.println("Digite o Id:\n");
		String id = scanner.nextLine();
		return id;
	}
	public String getCpf() throws NoSuchElementException{
		System.out.println("Digite o CPF:\n");
		String cpf = scanner.nextLine();
		return cpf;
	}
	public String getEmail() throws NoSuchElementException{
		System.out.println("Digite o Email:\n");
		String email = scanner.nextLine();
		return email;
	}
	public String getSenha() throws NoSuchElementException{
		System.out.println("Digite o Senha:\n");
		String senha = scanner.nextLine();
		return senha;
	}
	public Admin createAdmin() throws InvalidParameterException, NoSuchElementException{
		
		String name = this.getName();
		String id = this.getId();
		String senha = this.getSenha();
		String cpf = this.getCpf();
		String email = this.getEmail();
		
		return new Admin(id, name, cpf, email, senha);
	}
	
	
	public void start(){
		System.out.println("Para fazer login digite 1, para criar o perfil de professor/admin digite 0:\n");
		try {
			int escolha = this.scanner.nextInt();
			scanner.nextLine();
		
		
		switch (escolha) {
		case 0:
			if(admin == null){
				try {
					admin = createAdmin();
					System.out.println("Logado com sucesso.\n");
					this.menu();
				} catch (Exception e) {
					System.out.println("Argumento invalido");
				}
				
			}
			else{
				System.out.println("Admin já existe, tente logar no sistema");
			}
			break;
		case 1:
			System.out.println("Digite o id do admin, seguido da senha:\n");
			if(scanner.nextLine() == admin.getidCadastro() && scanner.nextLine() == admin.getSenha()){
				System.out.println("Logado com sucesso.\n");
				this.menu();
			}
		default:
			break;
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Argumento invalido");
		}
		
	}
	public void menu(){
		
			}
	public static void main(String[] args){
		Produtividade prod = new Produtividade();
		prod.start();
	}
}
