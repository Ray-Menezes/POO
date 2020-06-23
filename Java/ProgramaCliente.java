
public class ProgramaCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente(456,"João","123456789-00");
		ContaCorrente p = new ContaCorrente (111, "05/09/2018");
		ContaCorrente p1 = new ContaCorrente (222, "22/02/2012", 100000);
		
		c.associarConta(p);
		c.associarConta(p1);
		p.creditar(500);
		p.debitar(50);
		c.pesquisar(222);
		c.desassociarConta(p);
		
		c.exibir();	
	  c.mostrar();
	}

}
