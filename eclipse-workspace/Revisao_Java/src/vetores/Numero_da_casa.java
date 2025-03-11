package vetores;
import java.util.Scanner;

	public class Numero_da_casa {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int contador;
			int casas;
			int numero;
			
			System.out.println("Quantas casas tem no quarteirão?");
			casas = leia.nextInt();
			
			int vetor_casas[] = new int[casas];
			
			System.out.println("Qual o número da primeira casa do quarteirão?");
			numero = leia.nextInt();
			
			//Nesse caso n[0] = numero; n[1] = numero + 1; e assim sucessivamente
			for(contador=0;contador<casas;contador++) {
				
				vetor_casas[contador] = numero;
				System.out.println((contador + 1) + "a casa é a número:" + numero );
				numero++;
			}
			System.out.println("fim");
		}
}
