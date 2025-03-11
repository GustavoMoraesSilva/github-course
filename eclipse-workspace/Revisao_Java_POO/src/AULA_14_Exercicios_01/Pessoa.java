package AULA_14_Exercicios_01;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private int experiencia;
	
		//Método construtor
		public Pessoa(String nome, int idade, String sexo, int experiencia) {
			
		this.setNome(nome);
		this.getIdade();
		this.setSexo(sexo);
		this.setExperiencia(experiencia);
		
			
		}
		
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
	
			protected int getExperiencia() {
				return experiencia;
			}
	
			protected void setExperiencia(int experiencia) {
				this.experiencia = experiencia;
			}
	
			
		//Demais métodos (nesse caso apenas 1)
		public void ganharExperiencia() {
			
			this.setExperiencia(this.getExperiencia() + 1);
			System.out.println("+1 de experiência");
		}
}
