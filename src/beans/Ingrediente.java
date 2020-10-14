package beans;

import java.time.LocalDate;

public class Ingrediente {
	private String nome;
	private LocalDate validade;
	private float preco;
	private int quantidade;
	
	public Ingrediente(String nome, LocalDate validade, float preco, int quantidade) {
		super();
		this.nome = nome;
		this.validade = validade;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Ingrediente [nome=" + nome + ", validade=" + validade + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}
}
