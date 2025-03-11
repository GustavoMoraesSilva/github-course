package AULA_09_Exercicio_pratico;

public class Principal {
	public static void main(String [] args) {
		
		Pessoa P[] = new Pessoa [2];
		
			P[0] = new Pessoa("Jorge Macedo", 26, "M");
			P[1] = new Pessoa("Joanne Rowling", 100, "F");
			
			
	    Livro L[] = new Livro[2];
		
		L[0] = new Livro("Harry Potter e o cálice de fogo", P[1], 312, P[0]);
				
		L[0].abrir();
		L[0].folhear();
		L[0].detalhes();
		L[0].fechar();
		L[0].folhear();
		
		
	}
}
