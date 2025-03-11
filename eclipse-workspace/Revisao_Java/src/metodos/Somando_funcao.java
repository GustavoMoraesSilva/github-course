package metodos;


public class Somando_funcao {

	//Criando a função "soma"
	//Funções são criadas apartir de tipos primitivos(int,double,etc)
	//Funções obrigatoriamente retornam valores, precisam do "return" 
	static int soma(int a, int b) {
		int s = a+b;
		return s;
	}
	
	//Criando a classe principal, onde será chamada a função soma
	//E será exibido um "print" do "return s;"
	
	public static void main(String[] args) {
		
		//chamando a função soma e dando um print
		System.out.println(soma(1,2));
		
	}
}
