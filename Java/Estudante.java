public class Estudante
{
	// variaveis de instancia
	protected int matricula;
	protected String nome;
	protected char sexo;
	protected double notas[] = new double[4];
	private static int numEstudantes = 0;
	private Curso curso;
	
	// metodos construtores
	Estudante(){}
	Estudante(String nome) 
	{
		this.nome = nome;
	}
	Estudante(String nome,char sexo)
	{
		numEstudantes++;
		this.sexo = sexo;
		this.nome = nome;
	}
	Estudante(String nome,char sexo,int matricula)
   {
      // invocando outro construtor na mesma classe
      this( nome, sexo );
      this.matricula = matricula; 
   }
	Estudante(int matricula,String nome, char sexo)
	{
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
	}
   // metodos get e set
	public static int getNumEstudantes()
	{
		return numEstudantes;
	}

	public void setNome(String nome)
	{
		if (nome != null)
			this.nome = nome;
	}
	public void setSexo(char sexo)
	{
		if (sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F')
			this.sexo = sexo;
	}
	public void setMatricula(int matricula)	
	{
		if (matricula > 0)
			this.matricula = matricula;
	}
	public String getNome()	
	{
		return nome;
	}
	public char getSexo()	
	{
		return sexo;
	}
	public int getMatricula()	
	{
		return matricula;
	}
	public void setCurso( Curso c )
	{
		curso = c;
	}
	
	// metodos de instancia
   public void exibir(String a)
    {
      System.out.println(a);
      exibir();
    }
    
    public void exibir()
    { System.out.println("=========================================================================================");
      System.out.println("Matricula = " +matricula);
      System.out.println("Nome = " +nome);
      System.out.println("Sexo = " +sexo);
	  for (int i=0; i<4;i++)
	  {
	    System.out.println("Nota "+(i+1)+": "+notas[i]);
      }
	  //exibindo as informações de curso
	
	    //System.out.println("curso = " + curso.exibir() );
    }
    
    public void atribuirNota(int prova, double nota)
    {
      if (prova > 0 && prova < notas.length && nota >= 0.0 && nota <= 10.0)
      	{
    	   notas[prova-1] = nota;
    	}
    }
    
    public void atribuirNota(int prova)
    {
      atribuirNota(prova, 0.0);
    }
    
    public double lerNota(int prova)
    {
    	return notas[prova-1];
    }
    
    public void calcularMedia ()
    {
    	double media=0;
    	for(int i = 0; i<4; i++)
    	{
    		media = media+notas[i];
    	}
    	media = media/4;
    	if (media >=5 )
    	{ 
    	   System.out.println (nome+", Parabéns!!! Viu como foi bom estudar com garra e determinação?");
    	}
    	else
    	{
    		System.out.println();
    		System.out.println (nome +", voce foi reprovado!");
    	} 
    }
}