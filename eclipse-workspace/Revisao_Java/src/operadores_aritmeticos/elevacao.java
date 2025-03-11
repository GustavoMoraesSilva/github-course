package operadores_aritmeticos;
import java.util.Scanner;

public class elevacao {
 public static void main(String[] args) {
	 
	 Scanner leia = new Scanner(System.in);
	 
     int num;
     int ele;
     int resultado =1;
     int cont = 0;
     
     
     System.out.println("Digite um número: ");
     num = leia.nextInt();
     
     System.out.println("Você quer elevar " + num + " a qual expoente?");
     ele = leia.nextInt();
     
     
     for(cont=0;cont<ele; cont++) {
    	 
    	 resultado = resultado * num;
    	 
    	 
     }
     
    	 System.out.println(num + " elevado a " + ele + " é: " + resultado);
	 
	 
 }
}
