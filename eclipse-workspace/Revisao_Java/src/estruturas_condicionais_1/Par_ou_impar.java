package estruturas_condicionais_1;
import java.util.Scanner;

public class Par_ou_impar {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("------------");
		System.out.println("PAR OU ÍMPAR");
		System.out.println("------------");
		
		System.out.println("Digite o número que será analisado: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 ) {
			
			System.out.println("Seu número é PAR");
		}
		else {
			
			System.out.println("Seu número é ÍMPAR");
		}
		
	}
}
