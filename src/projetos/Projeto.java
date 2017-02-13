package projetos;

import java.util.List;
import java.util.Date;
import java.util.LinkedList;

import pessoa.Colaborador;

public class Projeto {
	private String titulo;
	private String dateInicio;
	private String dateFim;
	private String agFinan;
	private Double valorFinan;
	private String objetivo;
	private String descricao;
	private List<Colaborador> participantes = new LinkedList<Colaborador>();
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Projeto(String titulo, String dateInicio, String dateFim, String agFinan, Double valorFinan, String objetivo,
			String descricao, List<Colaborador> participantes) {
		super();
		this.titulo = titulo;
		this.dateInicio = dateInicio;
		this.dateFim = dateFim;
		this.agFinan = agFinan;
		this.valorFinan = valorFinan;
		this.objetivo = objetivo;
		this.descricao = descricao;
		this.participantes = participantes;
		this.state = "Em elaboração";
	}
	public Projeto(String titulo, String dateIn, String dateOut, String agFinan, Double valorFinan, String objetivo,
			String descricao) {
		super();
		this.titulo = titulo;
		this.dateInicio = dateIn;
		this.dateFim = dateOut;
		this.agFinan = agFinan;
		this.valorFinan = valorFinan;
		this.objetivo = objetivo;
		this.descricao = descricao;
		this.state = "Em elaboração";
	}
	public Projeto(){}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDateInicio() {
		return dateInicio;
	}
	public void setDateInicio(String dateInicio) {
		this.dateInicio = dateInicio;
	}
	public String getDateFim() {
		return dateFim;
	}
	public void setDateFim(String dateFim) {
		this.dateFim = dateFim;
	}
	public String getAgFinan() {
		return agFinan;
	}
	public void setAgFinan(String agFinan) {
		this.agFinan = agFinan;
	}
	public Double getValorFinan() {
		return valorFinan;
	}
	public void setValorFinan(Double valorFinan) {
		this.valorFinan = valorFinan;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LinkedList<Colaborador> getParticipantes() {
		return (LinkedList<Colaborador>) participantes;
	}
	public void setParticipantes(Colaborador participante) {
		this.participantes.add(participante);
	}
	

}
