package AULA_09_Exercicio_pratico;

public class Pessoa {

	//Atributos da classe pessoa
	private String nome;
	private int idade;
	private String sexo;
	
	//Método construtor
	public Pessoa(String nome,int idade, String sexo){
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		
	}


	//Métodos getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	private int getIdade() {
		return idade;
	}


	private void setIdade(int idade) {
		this.idade = idade;
	}


	private String getSexo() {
		return sexo;
	}


	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	//Demais métodos (nesse caso 1 só)
	
	public void fazer_aniversario() {
		
		this.setIdade(this.getIdade() + 1);
		System.out.println("Aniversário! " + this.getNome() + " agora tem " + this.getIdade() + " anos de idade");
		
	}
	
	
}

