package beans;

public class Cerveja {
	private String nome;
	private String cor;
	private Estilo estilo;
	
	public Cerveja() {}
        
        public Cerveja(String nome, String cor, Estilo estilo) {
            setNome(nome);
            setCor(cor);
            setEstilo(estilo);
        }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Cerveja [nome=" + nome + ", cor=" + cor + ", estilo=" + estilo + "]";
	}
}
