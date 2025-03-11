package AULA_12_Polimorfismo_01;

//Extends -> A classe Tartaruga é classe filha da classe Reptil
//Tipo de herança -> Para DIFERENÇA pois faz OVERRIDE, sobreposição de um método da classe mãe 
public class Tartaruga extends Reptil{

	
	
		//Método Construtor
		public Tartaruga(double peso, int idade, int membros, String cor_escama) {
			//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
			
			super(peso,idade,membros,cor_escama);
		}
		
		
		@Override // O método já existe mas sofrerá uma alteração para essa classe
		public void locomover() {
			
			System.out.println("Andando beeeeem devagar");
		}
}
