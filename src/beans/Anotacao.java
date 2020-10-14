package beans;

import java.time.LocalDateTime;

import beans.Autor;

public class Anotacao {
	private String titulo;
	private LocalDateTime timestamp;
	private String descricao;
	private Autor autor;
		
	public Anotacao() {
	}
	
	public Anotacao(String titulo, LocalDateTime timestamp, String descricao, Autor autor) {
		super();
		this.titulo = titulo;
		this.timestamp = timestamp;
		this.descricao = descricao;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Comentario [titulo=" + titulo + ", timestamp=" + timestamp + ", descricao=" + descricao + ", autor="
				+ autor + "]";
	}
}
