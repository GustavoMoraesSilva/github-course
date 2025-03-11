package vetores;
import java.util.Arrays;

	public class Valores_no_vetor_automatico {
		public static void main(String[] args){
			
		//Criando um vetor com 5 espaços, que vai de 0 até 4
		int vetor [] = new int[5];
		
		//Inserindo o valor 8 dentro de todos os espaços do vetor através da biblioteca Arrays
		Arrays.fill(vetor, 8);
		
		//Mostrando o vetor através de um "for it":
		
		for(int mostrar:vetor) {
			
			System.out.println(mostrar);
		}
			
			
			
			
			
		}
}
