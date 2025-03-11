package vetores;
import java.util.Arrays;

	public class Posicao_do_numero {
		public static void main(String[] args) {
			
			int n[] = {10,11,12,13,14};
			
			 
			 for(int numero: n) {
				 
				 int posicao = Arrays.binarySearch(n, numero);
				 System.out.println("o número " + numero + " está na posição " + posicao );
				 
				 
			 }
			
			
			
			
		}
}
