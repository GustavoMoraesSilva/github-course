package AULA_05_metodos_especiais_02;

import java.util.Scanner;

public class Conta_banco {

	//Definindo a criação e o nome de um Scanner;
	Scanner leia = new Scanner(System.in);
	
	//Criando os atributos da classe "Conta_banco" 
	//E definindo suas visibilidades (public,protected,private)
	public int num_conta;
	protected String tipo;
	private String dono;
	private double saldo;
	//O status false significa que a conta está fechada, e o status true significa que está aberta
	private boolean status;
	
	//Criando o método construtor
	public void Conta_banco() {
		
		//O saldo começará com 0 R$
	    this.setSaldo(0);
	    //O status da conta começará como false (fechada)
	    this.setStatus(false);
		
		
		
	}
	
	
	//Criando os outros métodos especiais (getters e setters)
	
	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	//Criando os demais métodos da classe
	public void abrir_conta(String t){
		this.setTipo(t);
		this.setStatus(true);
		
		String nome;
		System.out.println("Digite o nome completo de quem será o titular da conta:");
	    nome = leia.nextLine();
	    this.setDono(nome);
	    
	    int num;
		System.out.println("Digite um número de 4 dígitos para ser o número da conta de " + this.getDono() + ":");
		num = leia.nextInt();
		this.setNum_conta(num);
		

		//existirão dois tipos de conta, que definirão com quanto cada conta começa em $
		// CC -> Conta corrente
		// CP -> Conta poupança
		
		if(this.getTipo().equals("CC")) {
			
			System.out.println("Conta Corrente aberta");
			this.setSaldo(50);
		}
		else if(this.getTipo().equals("CP")) {
			
			System.out.println("Conta Poupança aberta");
			this.setSaldo(150);
		}
	}
	
	public void fechar_conta() {
		
		if(this.getSaldo() > 0) {
			System.out.println("Não é possível fechar uma conta com saldo positivo");
			System.out.println("A conta deve estar zerada para a operação prosseguir");
		}
		
		else if(this.getSaldo()<0) {
			System.out.println("Não é possível fechar uma conta com saldo negativo");
			System.out.println("A conta deve estar zerada para a operação prosseguir");
		}
		else {
			this.setStatus(false);
			System.out.println("A conta no nome de " + this.getDono() + " foi fechada");
		}
	}
	
	public void depositar() {
		
		if(this.isStatus() == true) {
			
			double deposito;
			System.out.println("Digite o quanto você quer depositar: ");
			deposito = leia.nextDouble();
			
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Foram depositados " + deposito + "R$ na sua conta ");
			System.out.println("Agora o seu saldo atual é de: " + this.getSaldo() + "R$");
		}
	
		else if (this.isStatus() == false) {
			
			System.out.println("Não é possível realizar um depósito pois a sua conta está fechada");
		}
	}
	
	public void sacar() {
		
		if(this.isStatus() == true) {
			
			double saque;
			System.out.println("Digite o quanto você quer sacar");
			saque = leia.nextDouble();
			
			if(this.getSaldo()>= saque) {
				
				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Foram sacados " + saldo + "R$ da sua conta");
				System.out.println("O seu saldo atual agora é: " + this.getSaldo()+ "R$");
			}
			
			else if(this.getSaldo()<saque){
				
				System.out.println("Você não possui saldo o suficiente para realizar essa operação");
			}	
		}
		
		else if(this.isStatus() == false) {
			
			System.out.println("Não é possível realizar essa operação, a sua conta está fechada");
		}
	}
	
	public void pagar_mensalidade() {
		
		double mensalidade;
		
		if(this.getTipo().equals("CC")) {
			
			mensalidade = 12;
			
			if(this.getSaldo()>= mensalidade) {
			this.setSaldo(this.getSaldo() - mensalidade);
			
			System.out.println("A mensalidade de " + mensalidade + "R$ da sua conta corrente foi paga");
			System.out.println("Agora o seu saldo atual é de: " + this.getSaldo() + "R$");
		 }
			else if(this.getSaldo()< mensalidade) {
				System.out.println("Não foi possível pagar a mensalidade, o seu saldo é insuficiente");
			}
		}
		
		
		else if (this.getTipo().equals("CP")) {
			
			mensalidade = 20;
			
			if(this.getSaldo()>= mensalidade) {
			this.setSaldo(this.getSaldo() - mensalidade);
			
			System.out.println("A mensalidade de " + mensalidade + "R$ da sua conta poupança foi paga");
			System.out.println("Agora o seu saldo atual é de: " + this.getSaldo() + "R$");
		}
			else if(this.getSaldo()< mensalidade) {
				System.out.println("Não foi possível pagar a mensalidade da sua conta, o seu saldo é insuficiente");
			}
       }
	}
	
	
	public void saldo_atual() {
		
		System.out.println("O seu saldo atual é de: " + this.getSaldo() + "R$");
	}
	
}
