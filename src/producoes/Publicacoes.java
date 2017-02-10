package producoes;

import java.util.List;

import pessoa.Colaborador;
import projetos.Projeto;

import java.util.Date;
import java.util.LinkedList;

public class Publicacoes {
	private List<Colaborador> authors = new  LinkedList<Colaborador>();
	private String title;
	private String nameCoference;
	private Date anoPublicada;
	private Projeto projeto;
	
	public Publicacoes() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Publicacoes(List<Colaborador> authors, String title, String nameCoference, Date anoPublicada,
			Projeto projeto) {
		super();
		this.authors = authors;
		this.title = title;
		this.nameCoference = nameCoference;
		this.anoPublicada = anoPublicada;
		this.projeto = projeto;
	}


	public boolean adicionarAuthor(Colaborador author){
		try {
			this.authors.add(author);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Colaborador> getAuthors() {
		return authors;
	}
	public String getNameCoference() {
		return nameCoference;
	}
	public void setNameCoference(String nameCoference) {
		this.nameCoference = nameCoference;
	}
	public Date getAnoPublicada() {
		return anoPublicada;
	}
	public void setAnoPublicada(Date anoPublicada) {
		this.anoPublicada = anoPublicada;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
	
}
