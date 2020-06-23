
public class Coordenador extends Professor {
	private String cargo;
	
	Coordenador ()
	{
		
	}
	
	Coordenador(String nome, String funcao, double salario, String[] disciplinas) {
		super(nome, funcao, salario, disciplinas);
	}


	public void criarTurmas()
	{
		System.out.println("Criei Turma");
	}
	
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	public String getCargo()
	{
		return cargo;
	}

}