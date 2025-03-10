package Anatomia_Classes;

public class Variavel_metodo {
	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		
		nome = "Gustavo";
		sobrenome = "Moraes";
		
		//Chamando o método "nomeCompleto"
		//Que irá juntar o "Gustavo" com "Moraes"
		System.out.println(nomeCompleto(nome, sobrenome));
		
		
	}
	
	// Método que representa o nome completo, juntando nome + sobrenome
	public static String nomeCompleto(String nome, String sobrenome) {
		
		return nome.concat(" ").concat(sobrenome);
		
		
	}
}
