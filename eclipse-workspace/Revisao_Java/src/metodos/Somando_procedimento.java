package metodos;

public class Somando_procedimento {

	//Primeiro vamos criar o procedimento soma
	//LEMBRANDO -> Procedimentos não retornam (return) valores
	
	public static void soma(int a, int b) {
		
		int S;
		S =  a+b;
		System.out.println("Resultado da  soma: " + S);
		
		
	}
	
	//Agora será criada a classe principal(main) que chamará o procedimento soma
	
	public static void main(String[] args) {
		
		//Iremos somar o número 1, e o número 2
		//Que representarão respectivamente o "a" e o "b"
		soma(1,2);
	}
	
}
