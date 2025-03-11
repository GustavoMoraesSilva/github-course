package AULA_11_Heranca_02;


//ABSTRACT -> Não gera objetos
//Geralmente serve para ser uma classe mãe
public abstract class Pessoa {

	String nome;
	int idade;
	String sexo;
	
	//Método construtor
	public Pessoa(String nome, int idade, String sexo) {
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
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
	
	//Demais métodos
	public void fazer_aniversario() {
		
		this.setIdade(1+ this.getIdade());
		System.out.println(this.getNome() + " fez aniversário! Agora tem " + this.getIdade()+ " anos de idade");
		
	}
	
}
