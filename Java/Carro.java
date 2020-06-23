public class Carro {
	private	String modelo;
	private	String placa;
	private	int ano;
	private	double valor;
	
	public Carro ()
	{
		
	}
	
	public Carro(String mod, String pla)
	{
        this.modelo = mod;
        this.placa = pla;
    }
	public Carro(String mod , String pla , int aa , double val) 
	{
		this.modelo = mod;
		this.placa = pla;
		this.ano = aa;
		this.valor = val;
	}
	
	void exibir()
	{
		System.out.println("Modelo : " + modelo + " | Placa : " + placa + " | Ano : " + ano + " | Valor : " + valor);
	}
	
	void aplicarDesconto(double i) 
	{
	    valor  = valor * ( 100 - i)/100;
	}

	//get and set
	
	
	public void setModelo (String modelo)
	{
		this.modelo = modelo;
	}
	
	public String getModelo()
	{return modelo;}
	
	public void setPlaca (String placa)
	{this.placa = placa;}
	
	public String getPlaca ()
	{return placa;}
	
	public void setAno (int ano)
	{this.ano = ano ;}
	
	public int getAno ()
	{return ano;}
	
	public void setValor (double valor)
	{this.valor = valor;}
	
	public double getValor()
	{return valor;}
	

	
	
	
}