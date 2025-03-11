package AULA_04_metodos_especiais;

import java.util.Scanner;

	public class Estante {
		
		//Definindo o Scanner;
		Scanner leia = new Scanner(System.in);
		
		//Criando os atributos e definindo suas visibilidades;
		private double largura;
		private double altura;
		private int total_documentos;
		private String numero_do_cadastro;
		
		//Criando o método construtor, que é chamado automaticamente quando o objeto é criado;
		//Ele necessita de parametração, como: método construtor(tipo atributo 1, tipo atributo 2){...
		public Estante(){
		
		 
			
		 this.setAltura(2);
		 this.setLargura(1.5);
		 
		 
		 //Criando o cadastro do usuário através de um código
		 //Esse cadastro terá uma estrutura de repetição que irá se repetir até que o código do cadastro seja válido
		 do {
		 System.out.println("---CADASTRO---");
		 System.out.println("Digite um código de 4 digítos:");
		 numero_do_cadastro = leia.next();
		 
		 if(numero_do_cadastro.length() != 4) {
			 System.out.println("Código inválido, tente novamente");
		 }
		 }while(numero_do_cadastro.length() != 4);
		
		}
		
		
		
		//Criando os métodos Getters e Setters;
		
	   public double getLargura() {
			return largura;
		}
		public void setLargura(double largura) {
			this.largura = largura;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public int getTotal_documentos() {
			return total_documentos;
		}
		public void setTotal_documentos(int total_documentos) {
			this.total_documentos = total_documentos;
			
		}
		public String getNumero_do_cadastro() {
			return numero_do_cadastro;
		}

		public void setNumero_do_cadastro(String numero_do_cadastro) {
			this.numero_do_cadastro = numero_do_cadastro;
		}	
		
	 
		//Criação de outros métodos
		
		public void inserir_documentos(){
			
			System.out.println("Número atual de documentos do código " + this.getNumero_do_cadastro() + ": " + this.getTotal_documentos());
			int documentos;
			System.out.println("Digite o número de documentos que você deseja inserir:");
			documentos = leia.nextInt();
			
			this.total_documentos += documentos;
			System.out.println(documentos + " documentos foram inseridos");
			
		  }	
		
		public void retirar_documentos() {
		     
			System.out.println("Número atual de documentos do código " + this.getNumero_do_cadastro() + ": " + this.getTotal_documentos());
			int documentos;
			System.out.println("Digite o número de documentos que você deseja retirar:");
			documentos = leia.nextInt();
			
			this.total_documentos -= documentos;
			System.out.println(documentos + " documentos foram retirados");
			
			
		 }
		}
		
