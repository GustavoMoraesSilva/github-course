package vetores;
import java.util.Scanner;

	public class Meses_do_ano {
		public static void main(String[] args) {
			
	      Scanner leia = new Scanner(System.in);
	      
	      int contador;
	      
          String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
          int dias[]= {31,28,31,30,31,30,31,31,30,31,30,31};
			
          //O contador vai começar em 0, vai até o tamanho (lenght) do vetor meses, no passo 1
          for(contador=0; contador<meses.length;contador++) {
        	  
        	  System.out.println("O mês " + meses[contador] + " tem " + dias[contador] + " dias");
        	  
          }
			
	}
}
