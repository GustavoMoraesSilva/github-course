package AULA_12_Polimorfismo_01;

//Extends -> A classe Ave é classe filha da classe Animal
public class Ave extends Animal{

	private String cor_pena;
	
	//Método construtor
	public Ave(double peso, int idade, int membros, String cor_pena) {
		//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
		super(peso,idade,membros);
		
		this.setCor_pena(cor_pena);
		
	}
 
	//Métodos getters e setter
	protected String getCor_pena() {
		return cor_pena;
	}

	protected void setCor_pena(String cor_pena) {
		this.cor_pena = cor_pena;
	}

	
	
	@Override //-> O método já existe mas será modificado para essa classe
	public void locomover() {
		
		System.out.println("Voando");
		
	}

	@Override //-> O método já existe mas será modificado para essa classe
	public void alimentar() {
		
		System.out.println("Comendo frutas e pequenos insetos");
	}

	@Override //-> O método já existe mas será modificado para essa classe
	public void emitir_som() {
		
		System.out.println("Piando e assobiando... piu piu");
	}
	
	//Métodos próprios da classe Ave (nesse caso apenas 1)
	public void fazer_ninho() {
		
		System.out.println("Fazendo ninho");
	}
}
