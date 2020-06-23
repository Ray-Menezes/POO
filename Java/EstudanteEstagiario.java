
public class EstudanteEstagiario extends Estudante {
	private String empresa;
	private double salario;
	
	EstudanteEstagiario(){super();}
	
	EstudanteEstagiario(String empresa)
	{
		this.empresa = empresa;
	}
	
	EstudanteEstagiario(String nome, char sexo,int matricula,double salario, String empresa)
	{
		super(nome,sexo,matricula);
		this.empresa = empresa;
		this.salario = salario;
	}
	
	
	
	public void trabalhar()
	{
		System.out.println("Trabalhando : ");
	}
	
	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}
	
	public String getEmpresa ()
	{
		return empresa;
	}
	
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public double getSalario()
	{
		return salario;
	}
	
	public void atribuirNota(int prova,double nota)
	{	
		if(prova > 0 && prova < notas.length && nota < 7.0)
		{
			notas[prova-1] = nota;
			System.out.println("Estudante Desligado! );");
		}
		if(prova >= 0 && prova <= notas.length && nota > 9.0)
		{
			notas[prova-1] = nota;
			System.out.println("Estudante Promovido!:)");
		}
	}
	
	
	
	
	public	void exibir()
	{
		System.out.println("Dados SuperClass");
		super.exibir();
		System.out.println("Empresa : "+empresa);
		System.out.println("Salario : "+salario);
	}
	
}