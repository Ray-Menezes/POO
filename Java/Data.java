public class Data {

	// estrutura interna = propriedades	}

	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int dia) 
	{
		if (dia >=1 && dia <=31)
			this.dia = dia;
		else
			System.out.println("Dia invalido");
	
	}	
	public int getDia() 
	{return dia;}	
	
	
	public void setMes(int mes) 
	{
		if (mes >0 && mes <=12)
			this.mes = mes;
		else
			System.out.println("Mes invalido");
	}
	
	public int getMes()
	{return mes;}
	
	
	public void setAno(int ano) 
	{
		if (ano >=1900 && ano <=3000)
			this.ano = ano;
		else
			System.out.println("Ano invalido");
	}
	
	public int getAno()
	{return ano;}
	
	Data() 
	{ 
		dia = 0;
		mes = 0;
		ano = 0;
	}
	


	Data ( int novoDia, int novoMes , int novoAno)	
	{
		System.out.println("Passou aqui");
		dia = novoDia;
		mes = novoMes;
		ano = novoAno;
		
	}
	// operações = métodos
	
	void exibir()
	{			
		System.out.println(dia+ "/" + mes + "/" + ano);
	}
	
}
	