package AULA_12_Polimorfismo_01;

//Extends -> A classe peixe será classe filha da classe Animal
public class Peixe extends Animal{

	private String cor_escama;

	
	//Método construtor
	public Peixe(double peso, int idade, int membros, String cor_escama) {
		//super -> Parte do método que foi herdado de sua super classe (classe mãe)
		super(peso, idade, membros);
		
		
		this.setCor_escama(cor_escama);
	}
	
	
	
	
	
	//Métodos getters e setters
	protected String getCor_escama() {
		return cor_escama;
	}

	protected void setCor_escama(String cor_escama) {
		this.cor_escama = cor_escama;
	}




   
	@Override //-> O método já existe mas será modificado para esta classe
	public void locomover() {
		
		System.out.println("Nadando");
	}





	@Override //-> O método já existe mas será modificado para esta classe
	public void alimentar() {
		
		System.out.println("Comendo algas e peixes menores");
	}





	@Override //-> O método já existe mas será modificado para esta classe
	public void emitir_som() {
		
		System.out.println("Som de peixe");
	}
	
	
	//Métodos próprios da classe Peixe (nesse caso apenas 1)
	
	public void soltar_bolha() {
		
		System.out.println("Soltando bolhas... Bluh, bluuh, bluh");
	}
	
}
