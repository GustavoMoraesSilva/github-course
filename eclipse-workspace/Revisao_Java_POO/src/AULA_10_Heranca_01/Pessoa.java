package AULA_10_Heranca_01;

//Classe Pessoa
//Será uma classe abstrata (não poderá ser instanciada)
//Será uma classe mãe para a criação de outras classe
public abstract class Pessoa {

	String nome;
	int idade;
	String sexo;
	
	
	
	//Métodos getters e setters
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	protected String getSexo() {
		return sexo;
	}
	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	//Demais métodos (nesse caso apenas 1)
	
	public void fazer_aniversario() {
		
		this.setIdade(1+ this.getIdade());	
	
	System.out.println("A idade de " + this.getNome() + " agora é " + this.getIdade() + " anos"  );
	
	}
} 
