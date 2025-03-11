package AULA_11_Heranca_02;


//Final -> não terá classes filhas
//Visitante será uma classe filha da classe Pessoa
//Porém não terá atributos nem métodos adicionais
//É um caso de HERANÇA PARA IMPLEMENTAÇÃO
public final class Visitante extends Pessoa {

	
	
	//Porém é necessário declarar novamente o método construtor
	//Junto com a palavra "super" que significa que o construtor vem de uma super classe (classe mãe)
	
	public Visitante (String nome, int idade, String sexo) {
		
	       super(nome, idade, sexo);
		
		
	}
}
