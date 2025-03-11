package estruturas_de_repeticao_2;
import java.util.Scanner;

	public class Cambalhota_do_while {
		public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int contador = 0;
		int cambalhotas;
		
		System.out.println("Digite o número de cambalhotas que você quer dar:");
		cambalhotas = leia.nextInt();
		
		//primeiro executa
		do {
			
			System.out.println(contador + "a cambalhota");
			contador++;
			
		}while(contador<cambalhotas);// depois lê a condição 
		
			
			
			
		
	}
}
