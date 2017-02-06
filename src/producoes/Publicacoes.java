package producoes;

import java.util.List;

import pessoa.Colaborador;

import java.util.LinkedList;

public class Publicacoes {
	private List<Colaborador> authors = new  LinkedList<Colaborador>();
	private String title;
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
	
	
}
