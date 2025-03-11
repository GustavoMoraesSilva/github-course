package estruturas_de_repeticao_3;
import java.util.Scanner;

public class Contagem_for {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int inicio;
		int fim;
		int contador;
		System.out.println("Digite o inicio da sua contagem");
		inicio = leia.nextInt();
		System.out.println("Digite o fim da sua contagem");
		fim = leia.nextInt();
		
		//No "for" são usados 3 variáveis
		//Funciona assim: for(começo,fim,passo);
		
		for(contador=inicio; contador<=fim; contador++) {
		
		System.out.println(contador);

		}
		
	}
}
