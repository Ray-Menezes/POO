
public class Motor {
	private double potencia;
	private int cilindrada;
	Motor(){}
	Motor(double potencia)
	{
		this.potencia = potencia;
	}
	
	Motor(double potencia, int cilindrada)
	{
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}
	
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	void exibir()
	{
		System.out.println("Potencia : "+potencia+" | Cilindrada : "+cilindrada);
	}

}
