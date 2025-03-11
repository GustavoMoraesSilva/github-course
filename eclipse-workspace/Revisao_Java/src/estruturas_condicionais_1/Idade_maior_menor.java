package estruturas_condicionais_1;
import java.util.Scanner;

public class Idade_maior_menor {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nascimento;
		int idade;
		
		System.out.println("Digite o ano que você nasceu: ");
		nascimento = leia.nextInt();
		
		idade = (2024 - nascimento);
		
		System.out.println("A sua idade é: " + idade + " anos");
		
		if(idade>= 18) {
			
			System.out.println("Você é maior de idade");
		}
		
		else {
			
		 System.out.println("Você é menor de idade"); 
		}
		
	}
}
