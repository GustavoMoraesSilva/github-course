package estruturas_de_repeticao_1;
import java.util.Scanner;

public class Cambalhota_while {
	public static void main(String[] args) {
	
	 Scanner leia = new Scanner(System.in);
	 
     int cambalhota;
     int contador = 1;
     
     System.out.println("Digite o número de cambalhotas que você quer realizar: ");
     cambalhota = leia.nextInt();
     
     //O While primeiro lê a condição e depois executa o comando.
	 while(contador<=cambalhota) {
		 
		 System.out.println(contador + "a cambalhota");
		 contador++;
	 }
	}
}
