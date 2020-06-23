import java.util.Scanner;
public class Diasemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int num = 1;
        while(num !=0){
            System.out.println("Digite um numero, 0 para Sair:");
            num = entrada.nextInt();
            switch (num){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
                
                default:
                    System.out.println("Dia inexistente");
                    break;
                case 0:
                    System.exit(num);
            }
        }
    }
}