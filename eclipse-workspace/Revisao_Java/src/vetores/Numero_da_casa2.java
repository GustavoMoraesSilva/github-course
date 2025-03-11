package vetores;
import java.util.Scanner;

	public class Numero_da_casa2 {
		public static void main(String[] args) {
	
			Scanner leia = new Scanner(System.in);
			
			int n[] = {10,11,12,13,14,15};
			int posicao;
			
			System.out.println("Existem 6 casas no quarteirão, que vão da posição 0 até a casa 5");
			System.out.println("Qual a posição da casa que você quer ver o número?");
			posicao = leia.nextInt();
			
			System.out.println("O número da casa de posição " + posicao + " é: " + n[posicao]);
	}
}
