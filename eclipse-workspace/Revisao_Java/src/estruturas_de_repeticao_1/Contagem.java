package estruturas_de_repeticao_1;
import java.util.Scanner;

	public class Contagem {
		public static void main(String[] args) {
	 
	      Scanner leia = new Scanner(System.in);
	      
	      int inicio;
	      int fim;
	      
	      
	      System.out.println("Digite o início da sua contagem");
	      inicio = leia.nextInt();
	      System.out.println("Digite o fim da sua contagem");
	      fim = leia.nextInt();
	      
	      while(fim>=inicio) {
	    	  
	    	  System.out.println(inicio);
	    	  inicio++;
	      }
	 
	 
	 
 }
}
