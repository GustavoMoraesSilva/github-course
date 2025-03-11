package operadores_logicos;
import java.util.Scanner;

public class maior_menor {
 public static void main(String[] args) {
	 
	 Scanner leia = new Scanner(System.in);
	 
	 int n1;
	 int n2;
	 
	 System.out.println("Digite o primeiro número: ");
	 n1 = leia.nextInt();
	 System.out.println("Digite o segundo número: ");
	 n2 = leia.nextInt();
	 
	 
	 //Será usada a estrutura condicional if para comparar os dois números.
	 if (n1>n2) {
		 
		 System.out.println(n1 + " é maior do que " + n2);
	 }
	 
	 if(n1<n2) {
		 
		 System.out.println(n1 + " é menor do que " + n2);
	 }
	 
	 if(n1 == n2) {
		
		 System.out.println(n1 + " é igual a " + n2);
	  }
	 
  }
}
