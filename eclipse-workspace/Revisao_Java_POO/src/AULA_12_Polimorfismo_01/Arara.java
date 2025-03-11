package AULA_12_Polimorfismo_01;


//Extends -> Arara é classe filha da classe Ave
//Tipo de herança -> para IMPLEMENTAÇÃO pois é igual a sua classe mãe mas pode ser instanciada
public class Arara extends Ave {

	
	
	//Método construtor
	public Arara(double peso, int idade, int membros, String cor_pena) {
		//super -> parte do método construtor que foi herdado da super classe (classe mãe)
		
		super(peso,idade,membros,cor_pena);
		
	}
}
