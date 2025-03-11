package operadores_aritmeticos;
import java.util.Scanner;

public class media {
 public static void main (String [] args) {
	 
	 Scanner leia = new Scanner (System.in);
	 int n1;
	 int n2;
	 double m;
	 
	
	 
	 System.out.println("Digite o primeiro número: ");
	 n1 = leia.nextInt();
	 System.out.println("Digite o segundo número: ");
	 n2 = leia.nextInt();
	 
	 m = (n1+n2)/2;
	 
	 System.out.println("A média entre " + n1 + " e " + n2 + " é: " + m);
	 
	 
	 
 }
}
