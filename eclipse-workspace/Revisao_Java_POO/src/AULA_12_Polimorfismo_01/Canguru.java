package AULA_12_Polimorfismo_01;

//Extends -> Canguru é uma classe filha da classe Mamifero
//Tipo de herança -> Para DIFERENÇA pois possui um OVERRIDE, uma sobreposição em um dos métodos da classe Mamifero
public class Canguru extends Mamifero{

	
	
	//Método construtor
	public Canguru(double peso, int idade, int membros, String cor_pelo) {
		//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
		
		super(peso, idade, membros, cor_pelo);
		
	}

	
	@Override //O método já existe mas sofrerá uma alteração para essa classe
	public void locomover() {
		
		System.out.println("Pulando");
	}
}

