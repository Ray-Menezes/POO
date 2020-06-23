

public class Microondas extends Aparelho implements Operacoes {
	
	public void Ligar()
	{
		System.out.println("Microondas ligado!");
	}

	public void Desligar()
	{
		System.out.println("Microondas Desligado!");
	}


	void exibir()
	{
		System.out.println("-----Microondas-----"
				+ "");
	}
}
