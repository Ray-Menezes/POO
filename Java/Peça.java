
public class Peça {
	private int codigo;
	private String descricao;
	
	Peça(){}
	Peça(int codigo)
	{
		this.codigo = codigo;
	}
	
	Peça(int codigo, String descricao)
	{
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	void exibir()
	{
		System.out.println("Codigo : "+codigo+" | Descrição : "+descricao);
	}
	
}
