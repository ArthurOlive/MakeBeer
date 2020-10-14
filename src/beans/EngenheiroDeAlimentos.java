package beans;

public class EngenheiroDeAlimentos extends Autor {
	private String registro;

	public EngenheiroDeAlimentos(String cpf, String nome) {
		super(cpf, nome);
	}

	public EngenheiroDeAlimentos(String cpf, String nome, String registro) {
		super(cpf, nome);
		this.registro = registro;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "EngenheiroDeAlimentos [registro=" + registro + "]";
	}
}
