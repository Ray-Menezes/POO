public class ObjEstudante {

	public static void main(String[] args) {
	Estudante a = new Estudante(2004001,"Maria silva", 'F');
	Estudante b = new Estudante(3687231,"Ray Menezes Monteiro", 'M');
	Estudante c = new Estudante(312312,"", 'F');
	
	// Estudante a
	
	a.atribuirNota(1,7.0);
	a.atribuirNota(2,8.2);
	a.atribuirNota(3,6.0);
	a.atribuirNota(4,5.5);
	a.exibir();
	a.calcularMedia();
	
	// Estudante B
	
	b.atribuirNota(1,7.5);
	b.atribuirNota(2,8.5);
	b.atribuirNota(3,5.0);
	b.atribuirNota(4,4.5);
	b.exibir();
	b.calcularMedia();
	
	//n Estudante C
	
	c.atribuirNota(1,9.5);
	c.atribuirNota(2,2.5);
	c.atribuirNota(3,4.0);
	c.atribuirNota(4,7.5);
	c.exibir();
	c.calcularMedia();



	}
}