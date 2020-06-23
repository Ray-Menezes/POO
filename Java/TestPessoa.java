
public class TestPessoa {

	public static void main(String[] args) 
	{
		Pessoa p = new Pessoa("João" , "Fortaleza" ,"996966 esqueci o resto" , 21); 
		Pessoa p1 =  new Pessoa ("José","Fortaleza "," 88 alguma coisa", 19);
		/* nao sei pq nao consegui adicionar.
		p.adicionaCarro(e);
		aaaaaeeee conseguiiii
		*/
		
		Carro c = new Carro("HRV", "2321",2018,110000);
		Carro c1 = new Carro("Carro de Mão", "9090", 1997 ,50);
		Carro c2 = new Carro("Carroça", "0800", 2035 , 200);
		Carro c3 = new Carro ("Compass", "23294", 2018 , 115000000);
		/*
		 nao consigo achar a placa tbm,só diz q nao encontra,ou é o print q ta no local errado,tentei mais nao deu.
		p.Pesquisar("0800");
		
		*/
		p.listar();
	
		p.setEndereco("Centro");
		//finge q adicionei 4 carros ai
		
		
		p.adicionaCarro(c1);
		p.adicionaCarro(c2);
		p.adicionaCarro(c3);
		p1.adicionaCarro(c);
		
		p.removerCarro("HRV");
		p.exibir();
		p1.exibir();
		
		
		
	

	}

}
