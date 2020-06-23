public class TestTurma {

	public static void main(String[] args) {
			Turma turma1 = new Turma("POO");
			Estudante e1 = new Estudante (1212,"Maria",'f');
			Turma turma2 = new Turma ("Tópicos");
			turma1.matricular(e1);
			turma1.listar();
			
			Estudante e2 = new Estudante(1818506,"Ray",'m');
			turma2.matricular(e2);
			turma2.listar();
			turma2.pesquisar(1818506);
			
			turma1.imprimirClasses();
			turma2.imprimirClasses();
			Estudante a= new EstudanteEstagiario();
			turma1.matricular(a);
			a.atribuirNota(1, 8);
			a.atribuirNota(2, 7);
			a.atribuirNota(3, 7);
			a.calcularMedia();
			
			
		}
			
	}


