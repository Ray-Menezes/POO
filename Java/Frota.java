import java.util.ArrayList;

public class Frota {
	Veiculo veiculo;
	ArrayList<Veiculo> frotas = new ArrayList<Veiculo>();
	
	void incluirVeiculo(Veiculo i)
	{
		frotas.add(i);
	}
	
//nao consigui fazer a questao 14  e 16, esse negocio de puxar uma pesquisa é tenso pra mim, por enquanto.
	public Veiculo excluirPlaca(String placa)
	{
	for(Veiculo e : frotas) 
		{

		if(e.getPlaca()==placa)
            {
                frotas.remove(placa);
               
            }
		}
		return null;

	}




}