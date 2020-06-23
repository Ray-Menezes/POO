
public class ProgramaHeranca {

	public static void main(String[] args) {
		Funcionario e = new Coordenador();
		e.setFuncao("Coordenador");
		e.setNome("Marum Simao Filho");
		e.setMatricula(123456);
		e.setDataNascimento("01/01/1973");
		e.setDataSalario("01/xx/xx");

		
		e.exibir();
		
		e.criarTurmas();
		e.leciona();
	
		
		
		}

}
