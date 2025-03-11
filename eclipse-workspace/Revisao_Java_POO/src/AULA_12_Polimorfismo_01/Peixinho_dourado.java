package AULA_12_Polimorfismo_01;

//Extends -> Peixinho_dourado é classe filha da classe Peixe
//Tipo de herança -> para IMPLEMENTAÇÃO pois é igual a sua classe mãe mas pode ser instanciada
public class Peixinho_dourado extends Peixe {

	
	//Método construtor
	public Peixinho_dourado(double peso, int idade, int membros, String cor_escama) {
		//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
		
		super(peso,idade,membros,cor_escama);
	}
}
