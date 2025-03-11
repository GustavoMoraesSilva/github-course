package vetores;
import java.util.Scanner;

	public class Valores_no_vetor {
		public static void main(String [] args) {
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("----------------");
			System.out.println("Valores no vetor");
			System.out.println("----------------");
			
			int vetor[] = new int[3];
			int cont;
			int limite = vetor.length;
			
			for(cont = 0 ;cont<limite; cont++) {
				
				int valor;
				System.out.println("Digite o valor que estará presente na posicao " + cont + ":");
				vetor[cont] = leia.nextInt();
				
			}
			
			System.out.println("Seu vetor:");
			
			for(int valor_vetor:vetor) {
				
				System.out.println(valor_vetor);
			}
			
			
		}
}
