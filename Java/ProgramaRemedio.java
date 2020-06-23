
public class ProgramaRemedio {

	public static void main(String[] args) {
		Remedio r = new Remedio (007,"Bond" , "1962" , "2015", 13);
		Remedio r1 = new Remedio (123,"Doflex" , "20/09/2018" , "21/09/2018", 15);
		Remedio r2 = new Remedio (2133,"ibuprofeno" , "20/09/2018" , "23/09/2018", 20);
		Prescricao p = new Prescricao ("James Bond", "20/09/2018" , "A internet");
		p.incluir(r);
		p.incluir(r1);
		p.incluir(r2);
//n nao consigo imprimir		p.imprimir();
		p.excluir(r2);
		p.pesquisar("Doflex");
		p.exibir();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
