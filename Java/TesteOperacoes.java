public class TesteOperacoes {

	public static void main(String[] args) {
		Automovel a = new Automovel();
		a.Ligar();
		a.Desligar();
		
		System.out.println("-----------------------------------------------");
		
		Televisao b = new Televisao();
		b.Ligar();
		b.Desligar();
		
		System.out.println("-----------------------------------------------");
		
		Microondas c = new Microondas();
		c.Ligar();
		c.Desligar();
	}

}
