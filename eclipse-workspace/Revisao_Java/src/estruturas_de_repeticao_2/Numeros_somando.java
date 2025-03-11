package estruturas_de_repeticao_2;
import java.util.Scanner;

	public class Numeros_somando {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("------------------");
			System.out.println("Somador de números");
			System.out.println("------------------");
			
			int numero;
			String resposta;
			int soma = 0;
			do {
				System.out.println("Digite o número que será somado: ");
				numero = leia.nextInt();
				
				soma += numero;
				
				System.out.println("Quer continuar? [S] ou [N]");
				resposta = leia.next();
				
			}while(resposta.equals("S"));
			
			System.out.println("A soma total foi: " + soma);
			
		}
}
