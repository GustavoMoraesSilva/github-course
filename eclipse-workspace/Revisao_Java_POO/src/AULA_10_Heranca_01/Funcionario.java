package AULA_10_Heranca_01;

import java.util.Scanner;

//"Funcionario extends Pessoa" -> Funcionario será uma classe filha da classe abstrata Pessoa
//Funcionario herdará atributos e métodos da classe Pessoa mas terá também seu atributos e métodos próprios
//Final -> A classe Funcionario NÃO terá classes filhas
public final class Funcionario extends Pessoa {

	//Criando um Scanner;
	Scanner leia = new Scanner(System.in);
	
	
	
	
	
	String setor;
	boolean trabalhando; // começará como false quando um objeto Funcionario for criado
	
	//Método construtor
	public Funcionario(String nome, int idade,String sexo, String setor) {
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setSetor(setor);
		this.setTrabalhando(false);
		
		
	}
	
	private String getSetor() {
		return setor;
	}
	private void setSetor(String setor) {
		this.setor = setor;
	}
	private boolean isTrabalhando() {
		return trabalhando;
	}
	private void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
	//Métodos próprios da classe Funcionario
	
	public void trabalhar() {
		
		this.setTrabalhando(true);
		System.out.println(this.getNome() + " começou a trabalhar");
	}

	
	public void parar_de_trabalhar() {
		
		this.setTrabalhando(false);
		System.out.println(this.getNome() + " parou de trabalhar");
	}
	

	public void mudar_setor() {
		
		String novo_setor;
		System.out.println("Digite o setor para qual " + this.getNome() + " irá mudar:");
		novo_setor = leia.nextLine();
		
		this.setSetor(novo_setor);
		
		System.out.println(this.getNome() + " foi para o setor: " + this.getSetor());
	}
}
