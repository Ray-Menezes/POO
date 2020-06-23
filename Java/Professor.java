
public class Professor extends Funcionario{

	protected String disciplinas [] = new String [10];
	
	Professor()
	{
		
	}
	
	Professor(String[] disciplinas)
	{
		this.disciplinas = disciplinas;	
	}

	Professor(String nome,String funcao,double salario,String[] disciplinas)
	{
		super();
		
	}
	
	public void aumentarSalario(double i)
	{
		i =(getSalario()*i)/100;
		
	}
	
}