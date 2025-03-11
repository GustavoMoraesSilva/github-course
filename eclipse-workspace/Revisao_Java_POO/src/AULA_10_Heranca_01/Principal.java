package AULA_10_Heranca_01;

public class Principal {
	public static void main(String [] args) {
		
		
		Funcionario F[] = new Funcionario [1];
		
		F[0] = new Funcionario("Rogério Akita", 22, "M", "T.I");
		
		F[0].trabalhar();
		F[0].parar_de_trabalhar();
		F[0].fazer_aniversario();
		
		
		Professor P[] = new Professor[1];
		
		P[0] = new Professor("Ronaldo Tavares", 47, "M", "Matemática", 3000 );
		
		P[0].receber_aumento();
		
		
	}
}
