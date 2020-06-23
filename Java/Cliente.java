import java.util.ArrayList;
public class Cliente {
	private int codigo;
	private String nome;
	private String cpf;
	
	ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
	
	
	
	void associarConta(ContaCorrente c)
	{
		contas.add(c);
	}
	
	void desassociarConta(ContaCorrente c)
	{
		contas.remove (c);
	}
	
	ContaCorrente pesquisar(int numero)
	{
		for(ContaCorrente c : contas)
		{
			if(c.getSaldo() == numero)
				return c;
		}
		return null;
	}
	
	
	Cliente (){}
	Cliente (int codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = nome;
	}
	Cliente (int codigo, String nome, String cpf)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
	}

	public void setCodigo(int codigo)
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
	
	public void setCpf (String cpf )
	{
		this.cpf = cpf;
	}
	
	public String getCpf ()
	{
		return cpf;
	}

	void exibir() 
	{
		System.out.println("Codigo : " + codigo + " | Nome : " + nome + " | Cpf : " +  cpf);
	}
	
	
	
	void mostrar()
	{
		for(int i = 0;i<contas.size();i++);
		{
			contas.get(0).exibir();
		}
	}
}
