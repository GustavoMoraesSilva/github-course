package operadores_logicos;
import java.util.Scanner;

	public class Comparar_str {
		public static void main(String [] args) {
			
	  Scanner leia = new Scanner(System.in);
	  
	  //String em Java é uma classe, com métodos.
	  String texto1;
	  String texto2;
	  
	  //Para comparar duas Strings deve-se usar o método 'equals' que compara os valores das Strings, ao invés de usar '=='.
	  texto1 = "Vasco";
	  texto2 = "Vasco";
	  
	  System.out.println("O conteúdo do texto1 é igual ao conteúdo do texto 2? " + texto1.equals(texto2));
			
			
   }
}
