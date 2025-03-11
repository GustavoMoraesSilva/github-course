package estruturas_condicionais_2;
import java.util.Scanner;

public class Pernas {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pernas;
		
		System.out.println("----------------");
		System.out.println("Número de pernas");
		System.out.println("----------------");
		
		System.out.println("Qual o número de pernas do animal que será analisado? ");
		pernas = leia.nextInt();
		
		switch(pernas) {
		
		//uma perna
		case 1: System.out.println("O animal é um saci");
		break;
		
		//duas pernas
		case 2: System.out.println("O animal é bípede");
		break;
		
		//quatro pernas
		case 4: System.out.println("O animal é quadrúpede");
		break;
		
		//seis ou 8 pernas
		case 6,8: System.out.println("O animal é uma aranha");
		break;
		
		//se o animal não possuir nenhum desses números de pernas, terá um "other case" que é o default;
		default: System.out.println("O animal é um E.T");
		break;
		}
		
		
	}
}
