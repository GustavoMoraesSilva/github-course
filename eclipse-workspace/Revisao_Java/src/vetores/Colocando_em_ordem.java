package vetores;
//importando a biblioteca arrays
import java.util.Arrays;
import java.util.Scanner;

	public class Colocando_em_ordem {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int numeros[] = {5,4,3,2,1,0};
	        	
			//colocando o vetor "numeros" em ordem
			//Esse "Arrays" veio da importação da biblioteca "java.util.Arrays"
			Arrays.sort(numeros);
			
			//Visualizando agora o vetor "numeros" em ordem através de um for it
			for(int valor: numeros) {
				
				System.out.println(valor);
			}
		}
}
