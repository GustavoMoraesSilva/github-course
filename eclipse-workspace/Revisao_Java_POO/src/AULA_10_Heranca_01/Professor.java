package AULA_10_Heranca_01;

import java.util.Scanner;

//"Professor extends Pessoa" -> Professor será uma classe filha da classe abstrata Pessoa
//Professor herdará atributos e métodos da classe Pessoa mas terá também seu atributos e métodos próprios
//Final -> A classe Professor NÃO terá classes filhas
public final class Professor extends Pessoa {

	//Criando um Scanner
	Scanner leia = new Scanner(System.in);
	
	
	String especialidade;
	double salario;
	
	//Método construtor
	public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
		
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setEspecialidade(especialidade);
		this.setSalario(salario);
		
	}

	//Métodos getters e setters
	
	private String getEspecialidade() {
		return especialidade;
	}

	private void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	private double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos próprios da classe Professor
	
	public void receber_aumento() {
		
		double aumento;
		
		System.out.println("Digite o aumento que " + this.getNome() + " irá receber (R$) :");
		aumento = leia.nextDouble();
		
		this.setSalario(this.getSalario() + aumento);
		System.out.println("Novo salário de " + this.getNome() + ": " + this.getSalario());
				
		
	}
	
}
