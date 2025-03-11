package operadores_logicos;
import java.util.Scanner;

	public class Pode_votar {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner (System.in);
			
			int idade;
			
			System.out.println("-------------");
			System.out.println("Opção de voto");
			System.out.println("-------------");
			
			System.out.println("Digite a sua idade:");
			idade = leia.nextInt();
			
			System.out.print("VOTO: ");
			
			//idade de 18 até 70 anos:
			if(idade>= 18 && idade<= 70) {
				
				System.out.println("Seu voto é obrigatório! ");
			}
			
			//idade entre 16 e menor que 18, ou mais que 70 anos:
			if((idade>= 16 && idade < 18) || (idade>70)) {
				
				System.out.println("Seu voto é opcional! ");
			}
			
			//idade menor do que 16 anos:
			if(idade<16) {
				
				System.out.println("Você ainda não possui idade mínima para votar!");
			}
   }
}
