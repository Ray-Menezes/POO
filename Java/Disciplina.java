
public class Disciplina {
	private String nome;
	private String codigo;
	private int cargaHoraria;
	
	Disciplina() {}
	Disciplina(String nome,String codigo,int cargaHoraria)
	{
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
	}
	
	Estudante [] estudantes = new Estudante [10];
	
	void exibir()
	{
		System.out.println("Nome = "+nome+"Codigo = "+codigo+"Carga horaria = "+cargaHoraria);
	}
	
	public void listar()
	{
		for(int i = 0;i<estudantes.length;i++)
		{
			estudantes[i].exibir();
		}
	}
	
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome ()
	{
		return nome;
	}
	
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	
	public String getCodigo()
	{
		return codigo;
	}
	
	public void setCargaHoraria(int cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria()
	{
		return cargaHoraria;
	}
	
	
}
