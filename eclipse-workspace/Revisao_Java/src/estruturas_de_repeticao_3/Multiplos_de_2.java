package estruturas_de_repeticao_3;
import java.util.Scanner;

	public class Multiplos_de_2 {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int fim;
			int contador;
			
			System.out.println("--------------");
			System.out.println("Multiplos de 2");
			System.out.println("--------------");
			
			System.out.println("Digite até qual número irá a ánalise:");
			fim = leia.nextInt();
			
			for(contador=0;contador<=fim;contador = contador + 2) {
				
				System.out.println(contador);
			}
			
			
			
			
			
			
		}
}
