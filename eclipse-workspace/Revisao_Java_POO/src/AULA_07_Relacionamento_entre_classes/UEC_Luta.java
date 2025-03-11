package AULA_07_Relacionamento_entre_classes;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class UEC_Luta {

	//O desafiado e o desafiante serão atributos do tipo "UEC_Lutador"
	//Ou seja, eles são lutadores
	
	private UEC_Lutador desafiado;
	private UEC_Lutador desafiante;
	private int rounds;
	//A luta só será aprovada == true quando o desafiado.categoria = desafiante.categoria 
	private boolean aprovada;
	

	//Método construtor
	public UEC_Luta(UEC_Lutador desafiado, UEC_Lutador desafiante, int rounds){
		
		this.setDesafiado(desafiado);
		this.setDesafiante(desafiante);
		this.setRounds(rounds);
		
	}
	
	
	//Métodos getters e setters
	private UEC_Lutador getDesafiado() {
		return desafiado;
	}
	private void setDesafiado(UEC_Lutador desafiado) {
		this.desafiado = desafiado;
	}
	private UEC_Lutador getDesafiante() {
		return desafiante;
	}
	private void setDesafiante(UEC_Lutador desafiante) {
		this.desafiante = desafiante;
	}
	private int getRounds() {
		return rounds;
	}
	private void setRounds(int rounds) {
		this.rounds = rounds;
	}
	private boolean isAprovada() {
		return aprovada;
	}
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
		
	}
	
	
	//Demais métodos
	
	public void marcar_luta(UEC_Lutador Lutador_1, UEC_Lutador Lutador_2 ) {
		
		Lutador_1 = this.desafiado;
		Lutador_2 = this.desafiante;
		
		//Se a categoria dos lutador for igual(.equals) a luta será aprovada
		if(Lutador_1.getCategoria().equals(Lutador_2.getCategoria())){
			
			this.setAprovada(true);
			System.out.println("Os dois lutadores são da mesma categoria...");
			System.out.println("A luta foi aprovada!");
			
		}
		//O "!" antes do objeto e do .equals NEGA a o .equals, é como se fosse um ".not_equals"
		else if(!Lutador_1.getCategoria().equals(Lutador_2.getCategoria())) {
			
			
			System.out.println("Os dois lutadores NÃO são da mesma categoria...");
			System.out.println("A luta NÃO foi aprovada");
		}
	}
	
	void lutar() {
		
		if(this.isAprovada() == true) {
		//A luta será por pontuação
		//A pontuação de cada atleta no round será gerada aleatoriamente através da biblioteca Random
		//Se vencedor_round = 1 o desafiado ganhou o round
		//Se vencedor_round = 2 o desafiante ganhou o round
		//Se vencedor_round = 3 o round deu empate
		
		int pontos_desafiado = 0;
		int pontos_desafiante = 0;
		
		
		 for(int i=1; i<=this.getRounds();i++) {
			
			Random numero_aleatorio = new Random();
			
			System.out.println("ROUND " + i);
			
			//Colocando um delay para dinamizar os rounds
			try {Thread.sleep(3000);}catch(InterruptedException ex) {}
			
			//Aleatorizando o vencedor
			int vencedor_round = numero_aleatorio.nextInt(3) ; //(3) significa que os números possíveis são:
			                                                   //0,1,2
	
			
				switch(vencedor_round) {
				
			
				case (0): 
					pontos_desafiado +=1;
				       System.out.println("O desafiado ganhou o " + i + "o round");
				       
				break;
				
				case (1):
					pontos_desafiante +=1;
				        System.out.println("O desafiante ganhou o " + i + "o round");
				       
				break;
				
				case (2): 
					pontos_desafiado  +=1;
				    pontos_desafiante +=1;
				    System.out.println("O round " + i + " empatou");
				        
				break;
			       
				  }
				 }
			
			if(pontos_desafiado>pontos_desafiante) {
				
				this.getDesafiado().ganhar_luta();
				this.getDesafiante().perder_luta();
				
			}
			
		    if(pontos_desafiante>pontos_desafiado) {
		    	
		    
		    	this.getDesafiado().perder_luta();
		    	this.getDesafiante().ganhar_luta();
		    }		
		    
		    if(pontos_desafiado == pontos_desafiante) {
		    	
		    	this.getDesafiado().empatar_luta();
		    	this.getDesafiante().empatar_luta();
		    }
	
		}
		else {
			
			System.out.println("A luta NÃO foi aprovada");
			System.out.println("NÃO é possível lutar");
		}
	}
}
