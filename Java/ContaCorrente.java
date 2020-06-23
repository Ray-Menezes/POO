
public class ContaCorrente {
	private int numero;
	private String datacriacao;
	private double saldo;
	ContaCorrente (){}
	ContaCorrente (int numero, String datacriacao)
	{
		this.numero = numero;
		this.datacriacao = datacriacao;
	}
	ContaCorrente (int numero, String datacriacao, double saldo) 
	
	{
		this.numero = numero;
		this.datacriacao = datacriacao;
		this.saldo = saldo;
	}
	
	public void creditar ()
	{
		saldo = 1;
	}
	public void creditar (double i)
	{
		saldo = saldo + i;
	}

	public void debitar()
	{
		saldo = -1 ;
	}
	public void debitar(double i)
	{	if (i <= saldo) 
		{
			saldo = saldo - i;
		}
		else
			System.out.println("Erro: valor a debitar maior que o saldo");
	}
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	public int getNumero ()
	{
		return numero;
	}
	
	public void setDatacriacao(String datacriacao)
	{
		this.datacriacao = datacriacao;
	}
	
	public String getDatacriacao()
	{
		return datacriacao;
	}
	
	public void setSaldo (double saldo)
	{
		this.saldo = saldo;
	}
	
	public double getSaldo ()
	{
		return saldo;
	}
	
	void exibir ()
	{
		System.out.println("Numero : " + numero + " | Data criação : " + datacriacao + " | Saldo : " + saldo);
	}
	
	
	
}
