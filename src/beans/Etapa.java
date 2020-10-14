package beans;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
	private int ordinal;
	private String titulo;
	private String descricao;
	private List<Anotacao> comentarios;
	
	public Etapa() {
		super();
	}
	
	public Etapa(int ordinal, String titulo, String descricao) {
		super();
		this.ordinal = ordinal;
		this.titulo = titulo;
		this.descricao = descricao;
		this.comentarios = new ArrayList<>();
	}
	
	public Etapa(int ordinal, String titulo, String descricao, List<Anotacao> comentarios) {
		super();
		this.ordinal = ordinal;
		this.titulo = titulo;
		this.descricao = descricao;
		this.comentarios = comentarios;
	}

	public int getOrdinal() {
		return ordinal;
	}
	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Anotacao> getAnotacoes() {
		return comentarios;
	}
	public void setAnotacoes(List<Anotacao> comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "Etapa [ordinal=" + ordinal + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}
}
