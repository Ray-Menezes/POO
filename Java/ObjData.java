
public class ObjData {

	public static void main(String[] args) {
		Data c1 =new Data(1,03,1997);
		c1.setDia(15);
		c1.setMes(11);
		c1.setAno(1900);
	
		c1.exibir();
		
	
		System.out.println("meuDia : "+ c1.getDia() );
		System.out.println("meuMes : " + c1.getMes() ); 
		System.out.println("meuAno : "+ c1.getAno() );
	
	}
	

}
