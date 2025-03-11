package AULA_12_Polimorfismo_01;

//Extends -> Reptil é classe filha da classe Animal
public class Reptil extends Animal {

	private String cor_escama;
	
	
	//Método construtor
	public Reptil(double peso, int idade, int membros, String cor_escama){
		//super -> Parte do método construtor que foi herdado de sua super classe (classe mãe)
		super(peso,idade,membros);
		
		this.setCor_escama(cor_escama);
	}

    //Métodos getters e setters
	protected String getCor_escama() {
		return cor_escama;
	}


	protected void setCor_escama(String cor_escama) {
		this.cor_escama = cor_escama;
	}
	
	    
		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void locomover() {
			
			System.out.println("Rastejando");
		}
		
		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void alimentar() {
			
			System.out.println("Comendo vegetais e outros animais");
		}
		
		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void emitir_som() {
			
			System.out.println("Som de réptil");
		}
}
