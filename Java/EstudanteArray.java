import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class EstudanteArray {

	public static void main(String[] args) {
	 	HashMap<Integer, Estudante> hm = new HashMap<Integer, Estudante>();

		Estudante e1 = new Estudante("Pedro");
		Estudante e2 = new Estudante ("Leonardo");
		Estudante e3 = new Estudante ("Michele");
		ArrayList<Estudante> list = new ArrayList<Estudante>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
	
		for ( Estudante e : list )
		{
		
		/*	
		e.exibir(); */
		
		}
	/*	for (int i = 0; i< list.size(); i++)
			if(list.get(i).getMatricula(i) == mat)
			{
				list.get(i).exibir();
				break;
			}
			##Falta colocar metodo "pesquisar" na classe
				*/		
			
		
		hm.put( 1 , e1 );
		hm.put( 2 , e2 );
		hm.put( 3 , e3 );
	
		
		System.out.println("dados após consulta na tabela");
	
		
		System.out.println("\nmostrando as chaves");
		Set<Integer> chaves = hm.keySet();
		
		for ( Integer i : chaves ) 
		{
			System.out.println ( i );
					
		}
		
		System.out.println("\nmostrando os valores");
		Collection<Estudante> valores = hm.values();
		for ( Estudante e : valores ) 
		{
			e.exibir();
		}

} 
	


	
}