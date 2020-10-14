package beans;

public class Estilo {
	private String nome;
	private double ph;
	private double porcAlcoolicoMin;
        private double porcAlcoolicoMax;
	
	public Estilo() {}
        
        public Estilo(String nome, double ph, double porcAlcoolicoMin, double porcAlcoolicoMax) {
            setNome(nome);
            setPh(ph);
            setPorcAlcoolicoMin(porcAlcoolicoMin);
            setPorcAlcoolicoMax(porcAlcoolicoMax);
        }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPh() {
		return ph;
	}
	public void setPh(double ph) {
		this.ph = ph;
	}
        
	public double getPorcAlcoolicoMin() {
		return porcAlcoolicoMin;
	}
	public void setPorcAlcoolicoMin(double porcAlcoolicoMin) {
		this.porcAlcoolicoMin = porcAlcoolicoMin;
	}
        
        public double getPorcAlcoolicoMax() {
		return porcAlcoolicoMax;
	}
	public void setPorcAlcoolicoMax(double porcAlcoolicoMax) {
		this.porcAlcoolicoMax = porcAlcoolicoMax;
	}
	@Override
	public String toString() {
		return "{\"nome\":\"" + nome + "\", ph\":\"" + ph + "\", porcAlcoolicoMin\":\"" + porcAlcoolicoMin + "porcAlcoolicoMax\":\"" + porcAlcoolicoMax + "}";
	}
}
