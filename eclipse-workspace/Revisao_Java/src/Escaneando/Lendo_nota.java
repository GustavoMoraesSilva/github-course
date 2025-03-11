package Escaneando;
import java.util.Scanner;

public class Lendo_nota {

	public static void main (String [] args) {
		
	Scanner leia = new Scanner (System.in);
	double nota ;
	
	System.out.println("Digite a sua nota:");
    nota = leia.nextDouble();
	
	System.out.println("A nota do aluno foi: " + nota);
	
	
 }
}
