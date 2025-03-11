package vetores;
import java.util.Scanner;

	
	public class Numero_da_casa3 {
		public static void main(String[] args) {
			
	   Scanner leia = new Scanner(System.in);
	   
	   
	   int casa[] = {101,102,103};
			
	        //valor será uma variável que receberá o valor do vetor casa até todos os valores dentro desse vetor serem utilizados.
	        //isso se chama "for it" que significa: para cada elemento
			for(int valor:casa) {
				
				System.out.println(valor);
			}
			
	}
}
