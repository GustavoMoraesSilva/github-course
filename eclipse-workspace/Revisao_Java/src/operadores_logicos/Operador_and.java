package operadores_logicos;
 import java.util.Scanner;

 public class Operador_and {
	 public static void main(String[] args) {
		 
		 Scanner leia = new Scanner (System.in);
		 
		 int n1;
		 int n2;
		 int n3;
		 
		 System.out.println("Digite o primeiro número (será o número principal): ");
		 n1 = leia.nextInt();
		 System.out.println("Digite o segundo número: ");
		 n2 = leia.nextInt();
		 System.out.println("Digite o terceiro número: ");
		 n3 = leia.nextInt();
		 
		 
		 // serão usados 4 operadores lógicos.
		 // == -> IGUAL
		 // != -> DIFERENTE
		 // && -> E
		 // || -> OU
		 
		 if((n1 == n2 && n1 != n3) || (n1 == n3 && n1 != n2)) {
			 
			 System.out.println(n1 + " é igual a 1 dos outros números");
			 
		 } if (n1 == n2 && n1 == n3) {
			 
			 System.out.println(n1 + " é igual aos outros 2 números");
		 }
		 if ( n1 != n2 && n1 != n3) {
			 
			 System.out.println(n1 + " é diferente dos outros números");
		 }
	 }
}
