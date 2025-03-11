package AULA_11_Heranca_02;

import java.util.Scanner;

//Extends -> Aluno_bolsista é uma classe filha de Aluno que é uma classe filha de Pessoa
//Final -> Não gerará classes filhas
//Tem também seus atributos e métodos próprios (somados com o da classe mãe)
//É um caso de HERANÇA PARA DIFERENÇA
public final class Aluno_bolsista extends Aluno{

	//Criando um scanner;
	Scanner leia = new Scanner(System.in);
	
	
	int porcentagem_bolsa;

    
	//Método construtor
	//super -> parte do método construtor que a classe herdou da classe mãe
	
	public Aluno_bolsista(String nome, int idade, String sexo, int matricula, String curso, int porcentagem_bolsa) {
		
		super(nome,idade,sexo,matricula,curso);
		
		this.setPorcentagem_bolsa(porcentagem_bolsa);
		
	}


	protected int getPorcentagem_bolsa() {
		return porcentagem_bolsa;
	}


	protected void setPorcentagem_bolsa(int porcentagem_bolsa) {
		this.porcentagem_bolsa = porcentagem_bolsa;
	}
	
	
	//Métodos próprios
	
	public void renovar_bolsa() {
		
		int renovacao_bolsa;
		System.out.println("Digite a porcentagem (%) que será a renovação da bolsa de " + this.getNome()+ ":");
		renovacao_bolsa = leia.nextInt();
		
		this.setPorcentagem_bolsa(renovacao_bolsa);
		System.out.println("A nova bolsa de " + this.getNome()+ " é de : " + this.getPorcentagem_bolsa()+ "%");
	}
	
	//Override -> o método "pagar_mensalidade" dessa classe irá sobrepor o método "pagar_mensalidade" da classe mãe
	@Override
	public void pagar_mensalidade() {
		
		double desconto = (1500 * this.getPorcentagem_bolsa()) / 100;
		double mensalidade = 1500 - desconto;

		System.out.println("A mensalidade de " + mensalidade + "R$ foi paga");
	}
}
