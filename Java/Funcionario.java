
public class Funcionario {
	private String nome;
	private int matricula;
	private String dataNascimento;
	private String dataSalario;
	private double salario;
	
	Funcionario()
	{
		
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setMatricula(int matricula)
	{
		this.matricula = matricula;
	}
	
	public int getMatricula ()
	{
		return matricula;
	}
	
	public void setDataNascimento (String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataNascimento()
	{
		return dataNascimento;
	}
	
	public void setDataSalario(String dataSalario)
	{
		this.dataSalario = dataSalario;
	}
	
	
	public String getDataSalario()
	{
		return dataSalario;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	void exibir()
	{
		System.out.println("Nome : "+nome+" | Matricula : "+matricula+" | Data Nascimento : "+dataNascimento+" | Data Salario : "+dataSalario);
	}

	
		
}


