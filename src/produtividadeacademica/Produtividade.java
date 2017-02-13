package produtividadeacademica;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import pessoa.Admin;
import pessoa.Estudante;
import pessoa.Professor;
import producoes.Orientacoes;
import producoes.Publicacoes;
import projetos.Projeto;

public class Produtividade {
	private Scanner scanner = new Scanner(System.in);
	private Admin admin = null;
	private List<Professor> professores = new LinkedList<Professor>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private List<Estudante> estudantes = new LinkedList<Estudante>();
	private List<Publicacoes> publicacoes = new LinkedList<Publicacoes>();
	private List<Orientacoes> orientacoes = new LinkedList<Orientacoes>();
	
	public String getName() throws NoSuchElementException{
		System.out.println("Digite o nome:\n");
		String name = scanner.nextLine();
		return name;
	}
	public String getTitle() throws NoSuchElementException{
		System.out.println("Digite o titulo:\n");
		String title = scanner.nextLine();
		return title;
	}
	public String getDateIn() throws NoSuchElementException{
		System.out.println("Digite a data de início:\n");
		String dateIn = scanner.nextLine();
		return dateIn;
	}
	public String getDateOut() throws NoSuchElementException{
		System.out.println("Digite a data de término:\n");
		String dateout = scanner.nextLine();
		return dateout;
	}
	public String getAgFin() throws NoSuchElementException{
		System.out.println("Digite a agência financiadora:\n");
		String aux = scanner.nextLine();
		return aux;
	}
	public String getObj() throws NoSuchElementException{
		System.out.println("Digite o objetivo:\n");
		String aux = scanner.nextLine();
		return aux;
	}
	public double getValor() throws NoSuchElementException, InputMismatchException{
		System.out.println("Digite o valor financiado:\n");
		double aux = scanner.nextDouble();
		scanner.nextLine();
		return aux;
	}
	public String getDescricao() throws NoSuchElementException{
		System.out.println("Digite a descricao:\n");
		String aux = scanner.nextLine();
		return aux;
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
		this.admin = new Admin("123", "Adnre", "78945613456", "suahusahuas@ic.ufal.br", "123456");
		try {
			int escolha = 0;
			escolha = this.scanner.nextInt();
			this.scanner.nextLine();
		
		
		switch (escolha) {
		case 0:
			if(this.admin == null){
				try {
					this.admin = createAdmin();
					System.out.println("Logado com sucesso.\n");
					this.menu();
				} catch (Exception e) {
					System.out.println("Dado errado");
				}
				
			}
			else{
				System.out.println("Admin já existe, tente logar no sistema");
			}
			break;
		case 1:
			String id = this.getId();
			String senha = this.getSenha();
			
			if(id.equals(admin.getidCadastro())  && senha.equals(admin.getSenha())){
				System.out.println("Logado com sucesso.\n");
				this.menu();
			}
			else{
				System.out.println("Id ou Senha incorreto(s)");
				this.start();
			}
		default:
			break;
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Argumento invalido");
			this.scanner.nextLine();
			this.start();
		}
		
	}
	public void menu(){
		System.out.println("-----------Menu-----------");
		System.out.println("1-----------Gerenciar projetos");
		System.out.println("2-----------Gerenciar colaboradores");
		System.out.println("3-----------Gerenciar Produções");
		System.out.println("4-----------Mudar Admin");
		System.out.println("5-----------Sair");
		int escolha;
		try {
			
			escolha = scanner.nextInt();
			scanner.nextLine();
			if(escolha>5 || escolha <1){
				throw new InputMismatchException();
			}
			else{
				switch (escolha) {
				case 1:
					this.gerenciarProj();
					break;

				default:
					break;
				}
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Digite um número válido");
			scanner.nextLine();
			this.menu();
		}

	}
	public void gerenciarProj(){
		System.out.println("----------Projetos----------");
		System.out.println("1---------Cadastrar novo projeto");
		System.out.println("2---------Editar proj existente");
		System.out.println("3---------Sair");
		int escolha;
		try {
			
			escolha = scanner.nextInt();
			scanner.nextLine();
			if(escolha>3 || escolha <1 ){
				throw new InputMismatchException();
			}
			else{
				switch (escolha) {
				case 1:
					Projeto newProj = new Projeto();
					newProj = this.newProj();
					break;

				default:
					break;
				}
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Digite um número válido");
			scanner.nextLine();
			this.gerenciarProj();
		}
		
	}
	public Projeto newProj(){
		String title = getTitle();
		String dateIn = getDateIn();
		String dateOut = getDateOut();
		String agFin = getAgFin();
		double valor = 0;
		try {
			valor = getValor();
		} catch (InputMismatchException e) {
			System.out.println("Digite um valor valido");
			valor = getValor();
		}
		
		String obj = getObj();
		String descricao = getDescricao();
		Projeto projAux = new Projeto(title,dateIn,dateOut,agFin,valor, obj, descricao);
		
		
	
		return null;
	}
	public static void main(String[] args){
		
		Produtividade prod = new Produtividade();
		prod.start();
	}
}
