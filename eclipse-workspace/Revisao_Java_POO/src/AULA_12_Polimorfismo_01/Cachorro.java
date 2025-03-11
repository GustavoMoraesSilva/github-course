package AULA_12_Polimorfismo_01;

//Extends -> Cachorro será uma classe filha da classe Mamifero
//Tipo de herança -> para DIFERENÇA pois possui métodos novos e OVERRIDE, sobreposição
public class Cachorro extends  Mamifero{

	

	//Método construtor
	public Cachorro(double peso, int idade, int membros, String cor_pelo) {
		//super-> parte do método construtor que foi herdado da super classe (classe mãe)
		super(peso,idade,membros,cor_pelo);
		
	}
	
	
	@Override //-> "Esse método já existe mas sofrerá uma alteração para essa classe
	public void emitir_som() {
		
		System.out.println("Latindo");
	}
	
	
	
	
	
	//Métodos próprios
	public void abanar_rabo() {
		
		System.out.println("Abanando o rabo");
	}
	
	public void enterrar_osso() {
		
		System.out.println("Enterrando osso");
	}
}
