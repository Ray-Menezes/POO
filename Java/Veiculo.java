import java.util.HashMap;
import java.util.ArrayList;

//n Abstract?
public abstract class Veiculo {
	private String placa;
	private long chassi;
	private	long ano;
	private	int peso;
	private	float velocMax;
	private double preco;
	private int capacidade;
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	//peças
	
	HashMap<Integer, Peça> hm = new HashMap<Integer, Peça>();
	
	
	<hm> void incluir(Integer a ,hm i)
	{
		 hm.put(a , (Peça) i);
	}
	
	<hm> void excluir(Integer a ,hm i)
	{
		 hm.remove(i);
	}
	
	
	void consultar(Integer e)
	{	Integer keyToSearch = e; 

		   if ( hm.containsKey( keyToSearch ) ) 
			   {
			   	System.out.println("Valor da Chave "+keyToSearch+" = "+hm.get(keyToSearch));             
			   }
			    
		  else
				    	
		   {
			  System.err.println("Chave não existe");
		   }
     

	}
	
	
	
	Veiculo(){}
	Veiculo(String placa, long chassi, long ano)
	{
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
	}
	
	Veiculo(String placa, long chassi, long ano, int peso, float velocMax, float preco, int capacidade)
	{
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
		this.capacidade = capacidade;
				
	}
	
	//metodos
	
	
	void aumentarPreco (double aumento)
	{
		preco = preco + aumento;
	}
	
	void reduzirPreco(double reduzir)
	{
		preco = preco - reduzir;
	}
	
	
	
	
	//n usei set and get do eclipe,como eu já "aprendi" ,ai poupa o tempo,por enquanto. né preguiça n
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public long getChassi() {
		return chassi;
	}
	public void setChassi(long chassi) {
		this.chassi = chassi;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public float getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	void exibir ()
	{
		System.out.println("Placa : "+placa+" | Chassi :"+ano+" | Peso : "+velocMax+" | Velocidade Maxima : "+preco+" | Preco : "+capacidade+" | Capacidade : " );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
