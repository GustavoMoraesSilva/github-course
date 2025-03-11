package estruturas_condicionais_2;
import java.util.Scanner;

	public class Par_ou_impar_melhorado {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int escolha;
			int pares = 0;
			int impares = 0;
			
			do {
				System.out.println("Digitar um número[1]");
				System.out.println("Parar o programa[2]");
				escolha = leia.nextInt();
				
				int numero;
				
				
				switch(escolha) {
				
				case 1: System.out.println("Digite um numero:");
				numero = leia.nextInt();
				
				if (numero%2 == 0) {
					pares = pares + 1;
				}
				if(numero%2 != 0) {
					impares = impares +1;
				  }
				}
				
			}while(escolha != 2);
			
			System.out.println("Número de pares digitados: " + pares);
			System.out.println("Número de ímpares digitados: " + impares);
	}
}
