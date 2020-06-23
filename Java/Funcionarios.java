
public class Funcionarios {
	private String nome;
	private String funcao;
	private double salario;
	
	
	Funcionarios(){}
	
	Funcionarios(String nome,String funcao,double salario)
	{
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	
	public void aumentarSalario (double i)
	{
		salario = (salario*i)/100;
	}
	
	void exibir()
	{
		System.out.println("Nome : "+nome+" | Função : "+funcao+"| Salario : "+salario);
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setFuncao(String funcao)
	{
		this.funcao = funcao;
	}
	
	public String getFuncao()
	{
		return funcao;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	
		
	
}
