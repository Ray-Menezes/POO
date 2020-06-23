public class Pessoa {
	private	String nome;
	private	String endereco;
	private	String telefone;
	private	int idade;
	
	private	Carro carros [] = new Carro[5];
	private int numCarros = 0;	
	
	public Pessoa()
	 {
		 
	 }
	 
	public Pessoa(String nom, int id)
	{
		this.nome = nom;
		this.idade = id;
	}
	     
	 
	public Pessoa(String nom , String end , String tel, int id)
	{
		this.nome = nom;
		this.endereco = end;
		this.telefone = tel;
		this.idade = id;
		
	}
	
	
	
	// get and set
	
	public void setNome (String nome ) 
	{this.nome = nome;}
	
	public String getNome ()
	{ return nome; }
	
	public void setEndereco (String endereco)
	{this.endereco = endereco;}
	
	public String getEndereco()
	{return endereco;}
	
	public void setTelefone (String telefone)
	{this.telefone = telefone;}
	
	public String getTelefone()
	{return telefone;}

	public void setIdade (int idade)
	{this.idade = idade;}
	
	public int geIdade ()
	{return idade;}
	
	//relacionados a associação "Carro"

	
	
	public void adicionaCarro (Carro e )
	{
		carros[numCarros] = e;
		numCarros++;
	}
	
	
	  public void removerCarro(String i)
	  {
          for(int e = 0 ; e < carros.length; e++)
          {

              if(carros[e].getModelo()==i)
              {
                  carros[e]=null;
                  return;
              }
            }
          return;
        }
	  
	  
	
	public void removerPlaca(String pla)
	{
        for(int e = 0 ; e < carros.length; e++)
        {

            if(carros[e].getPlaca()==pla)
            {
                carros[e]=null;
                return;
            }
          }
        return;
     }


	
	public Carro Pesquisar (String pla)
	{
		for (int i = 0 ; i < carros.length; i++) 
		{
			if ((carros[i]!= null) && (carros[i].getPlaca()==pla))
					{
						return carros[i];
					}
		
		}
		 System.out.println("Placa inexistente : " + pla);
		return null;
	}
	
	void listar ()
	{
		for (int i=0; i < carros.length; i++) 
		{
	        System.out.println(carros[i]);
		}
		
	}
	
	
	public void exibir()
	{
		System.out.println("Nome : " + nome + " | Endereço : " + endereco + " | Telefone : " + telefone + " | Idade : " + idade);
			
		for ( Carro e : carros ) 
			 {
				 if (e != null)
					 e.exibir();
				 else
					 System.out.println("célula do array não ocupada");
				 
			 }
	}

	

	
}
