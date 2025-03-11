package AULA_11_Heranca_02;

import java.util.Scanner;

//Final -> não gerá classes filhas
//Extends -> é uma classe filha da classe pessoa
//Possui atributos e métodos próprios (somados com o da classe mãe)
//É um caso de HERANÇA PARA DIFERENÇA 
public final class Professor extends Pessoa {

	
	//Criando um Scanner
	Scanner leia = new Scanner(System.in);
	
	String especialidade;
	double salario;
	
	public Professor(String nome, int idade, String sexo,String especialidade, double salario) {
		
		super(nome, idade, sexo);
		
		this.setEspecialidade(especialidade);
		this.setSalario(salario);
		
	}

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

	
	//Métodos próprios (nesse caso apenas 1)
	public void receber_aumento() {
		
		double aumento;
		System.out.println("Quanto " + this.getNome() + " receberá de aumento (R$):");
		aumento = leia.nextDouble();
		
		this.setSalario(this.getSalario() + aumento);
		System.out.println("Novo salário de " + this.getNome() + ": " + this.getSalario() + "R$");
		
	}
}
