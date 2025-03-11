package AULA_12_Polimorfismo_01;

//Extends -> A classe cobra é uma classe filha da classe Reptil
//Tipo de herança -> Para IMPLEMENTAÇÃO pois é igual a sua super classe mas pode ser instanciada
public class Cobra extends Reptil{

	
	//Método construtor
	public Cobra(double peso, int idade, int membros, String cor_escama) {
		//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
		
		super(peso,idade,membros,cor_escama);
	}
}
