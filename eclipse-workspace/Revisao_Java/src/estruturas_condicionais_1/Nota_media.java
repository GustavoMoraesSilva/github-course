package estruturas_condicionais_1;
import java.util.Scanner;

	public class Nota_media {
		public static void main(String[] args) {
			
	     Scanner leia = new Scanner(System.in);
	     
	     int prova_1;
	     int prova_2;
	     
	     System.out.println("----------");
	     System.out.println("NOTA MEDIA");
	     System.out.println("----------");
	     
	     System.out.println("Digite a nota que você tirou na primeira prova: ");
	     prova_1 = leia.nextInt();
	     System.out.println("Digite a nota que você tirou na segunda prova: ");
	     prova_2 = leia.nextInt();
	     
	     double media = (prova_1 + prova_2)/2;
	     System.out.println("A sua média foi: " + media);
	     
	     if(media>=60) {
	    	 System.out.println("Você ficou acima da média!");
	     }
	     
	     if(media<60) {
	    	 
	    	 System.out.println("Você ficou abaixo da média");
	     }
		 if (media>=80) {
			 
			 System.out.println("Você conseguiu o honra ao mérito, parabéns!");
		 }
	}
}
