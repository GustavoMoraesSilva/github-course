package operadores_aritmeticos;
import java.util.Scanner;

public class sucessor_antecessor {
 public static void main (String [] args) {
	 
	 Scanner leia = new Scanner (System.in);
	 
	 int n;
	
	 
	 System.out.println("Digite um número: ");
	 n = leia.nextInt();
	 
	
	 
	 System.out.println("Seu número: " + n);
	 System.out.println("Antecessor: " + (n-1));
	 System.out.println("Sucessor: " + (n+1) );

 }
}
