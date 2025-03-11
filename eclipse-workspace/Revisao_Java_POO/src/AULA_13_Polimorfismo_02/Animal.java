package AULA_13_Polimorfismo_02;

//Será a classe raiz, que servirá de base para a criação de outras classes
//Abstract -> Não poderá ser instânciada
public abstract class Animal {

	//Atributos
	private double peso;
	private int idade;
	private int membros;
	
	//Método construtor
	public Animal(double peso, int idade, int membros) {
		
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMembros(membros);
		
	}

	
	//Métodos getters e setters
	protected double getPeso() {
		return peso;
	}



	protected void setPeso(double peso) {
		this.peso = peso;
	}



	protected int getIdade() {
		return idade;
	}



	protected void setIdade(int idade) {
		this.idade = idade;
	}



	protected int getMembros() {
		return membros;
	}



	protected void setMembros(int membros) {
		this.membros = membros;
	}

	
		//Criação dos métodos que todo animal terá
		//Eles serão criados nessa classe como Abstratos
		//Método abstrato -> é declarado mas NÃO é implementado na progenitora
		//Será implementado nas outras classes atr	avés do polimorfismo OVERRIDE (sobreposição)
		
	
		public abstract void locomover();
	    public abstract void alimentar();
	    public abstract void emitir_som();
	}