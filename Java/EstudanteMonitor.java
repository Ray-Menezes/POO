
public class EstudanteMonitor extends Estudante {
	private	double bolsa;
	private String disciplina;
	
	EstudanteMonitor(){super();}
	EstudanteMonitor(double bolsa)
	{
		this.bolsa = bolsa;
	}
	EstudanteMonitor(String nome, char sexo,int matricula,double bolsa, String disciplina)
	{
		super(nome,sexo,matricula);
		this.bolsa = bolsa;
		this.disciplina = disciplina;
	}
	
	
	public void tirarDuvidas()
	{
		System.out.println("Tirando Duvidas : ");
	}
	
	public void auxiliarProfessor()
	{
		System.out.println("Auxiliando Professor : ");
	}
	
	public void atribuirNota(int prova,double nota)
	{
		if(prova > 0 && prova < notas.length && nota < 7.0)
		{
			notas[prova-1] = nota;
			System.out.println("Estudante Desligado! );");
		}
	}
	
	
	
	
	
	
	public void setBolsa(double bolsa)
	{
		this.bolsa = bolsa;
	}
	
	public double getBolsa()
	{
		return bolsa;
	}
	
	public void setDisciplina(String disciplina)
	{
		this.disciplina = disciplina;
	}
	
	public String getDisciplina()
	{
		return disciplina;
	}
	
	public void exibir()
	{
		System.out.println("Dados SuperClass");
		super.exibir();
		System.out.println("Bolsa : "+ bolsa);
		System.out.println("Disciplina : "+ disciplina);
	}
	
	
}
