import java.util.ArrayList;

public class Prescricao {
	private String paciente;
	private String data;
	private String medico;
	
	//metodos relacionados ao remedio
	
	ArrayList <Remedio> remedios = new ArrayList<Remedio>();
	
	public void incluir(Remedio i)
	{
		remedios.add(i);
	}
	
	public void excluir (Remedio i)
	{
		remedios.remove(i);
	}
	
/*	o .get() nao ta dando
 
 	void imprimir ()
	{
		for (int i = 0; i<remedios.size();i++);
		{
			remedios.get(i).exibir();
		}
	} */
	
	
	public Remedio pesquisar (String nome)
	{
		for(Remedio c : remedios)
		{
			if(c.getNome() == nome)
				return c;
		}
		return null;
	}
	
	
	
	
	
	
	
	// construtores
	Prescricao (){}
	Prescricao (String paciente, String data)
	{
		this.paciente = paciente;
		this.data = data;
	}
	
	Prescricao (String paciente, String data, String medico)
	{
		this.paciente = paciente;
		this.data = data;
		this.medico = medico;
	}

	//set and get
	
	public void setPaciente (String paciente)
	{
		this.paciente = paciente;
	}
	
	public String getPaciente ()
	{
		return paciente;
	}
	
	public void setData (String data)
	{
		this.data = data;
	}
	
	public String getData()
	{
		return data;
	}
	
	public void setMedico(String medico)
	{
		this.medico = medico;
	}
		
	public String getMedico ()
	{
		return medico;
	}
	
	void exibir()
	{
		System.out.println("Paciente : " + paciente + " | Data : " + data + " | Medico : " + medico );
	}
	
	
	
	
	
	
}
