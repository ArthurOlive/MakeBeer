package beans;

public class Calculadora {
	
	public static double calcularAbv(double densidadePreFerm, double densidadePosFerm) {
		return 131.25 * (densidadePreFerm - densidadePosFerm);
	}
	
	public static double calcularIbu(double utilizacao, double massaLupulo,
			double unidadeAlfa, double volumeCerveja) {
		return (utilizacao * massaLupulo * unidadeAlfa) / volumeCerveja;
	}
	
}
