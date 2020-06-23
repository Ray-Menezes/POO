
public class Remedio {
	private int codigo;
	private String nome;
	private String dataFabricacao;
	private String dataValidade;
	private double preco;
	
	public Remedio() {}
	public Remedio(int cod, String nom)
	{
		this.codigo = cod;
		this.nome = nom;
		
	}
	
	public Remedio (int cod, String nom, String dataFabricacao, String dataValidade, double preco)
	{
		this.codigo = cod;
		this.nome =  nom;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
		this.preco = preco;
	}
	//metodos	
	
	public void aumentarPreco(double i)
	{
		preco = preco + i;
	}
	
	public void reduzirPreco(double i)
	{
		preco = preco - i;
	}
	
	//set and get
	
	public void setCodigo (int codigo)
	{
		this.codigo = codigo;
	}
	
	public int getCodigo ()
	{
		return codigo;
	}
	
	public void setNome (String nome)
	{
		this.nome = nome;
	}
	
	public String getNome ()
	{
		return nome;
	}
	
	public void setDataFabricacao (String dataFabricacao)
	{
		this.dataFabricacao = dataFabricacao;
	}
	
	public String getDataFabricacao ()
	{
		return dataFabricacao;
	}
	
	public void setDataValidade (String dataValidade)
	{
		this.dataValidade = dataValidade;
	}
	
	public String getDataValidade ()
	{
		return dataValidade;
	}
	
	public void setPreco (double preco)
	{
		this.preco = preco;
	}
	
	public double getPreco()
	{
		return preco;
	}
	void exibir()
	{
		System.out.println("Codigo : " + codigo + " | Nome : " + nome + " | Data Fabricação : " + dataFabricacao + " | Data validade : " + dataValidade + " | Preço");
	}
	
	
	

}
