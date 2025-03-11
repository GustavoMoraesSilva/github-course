package AULA_06_encapsulamento;


//Criando a classe "Controle_Remoto", que implementa os métodos que serão chamados na Interface "Controlador"
//Controle_Remoto -> Classe
//Controlador -> Interface implemementada pela Classe "Controle_Remoto"
public class Controle_Remoto implements Controlador {

	//Criando os atributos da classe "Controle_Remoto"
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Criando o método construtor, que definirá a forma como a classe se inicia
	public void Controle_Remoto() {
		
		this.setVolume(50);		
		this.setLigado(false);
		this.setTocando(false);
	}
	
	
	
	
	
	
	
		//Métodos Getters e Setters dos atributos "volume", "ligado", "tocando" (todos privados)
		private int getVolume() {
			return volume;
		}
	
		private void setVolume(int volume) {
			this.volume = volume;
		}
	
		private boolean isLigado() {
			return ligado;
		}
	
		private void setLigado(boolean ligado) {
			this.ligado = ligado;
		}
	
		private boolean isTocando() {
			return tocando;
		}
	
		private void setTocando(boolean tocando) {
			this.tocando = tocando;
		}

		
		
	@Override
	public void ligar() {
		if(this.isLigado() == false) {
			
			this.setLigado(true);
			System.out.println("Ligado: " + this.isLigado());
	 }
	}

	@Override
	public void desligar() {
		if(this.isLigado() == true) {
			
			this.setLigado(false);
			System.out.println("Ligado: " + this.isLigado());
			
	 }
	}

	@Override
	public void abrirMenu() {
		
		System.out.println("--MENU--");
		System.out.println("Ligado: " + this.isLigado());
		
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i<this.getVolume();i = i + 5) {
			
			System.out.print("|");
		}
		System.out.println("Tocando: " + this.isTocando());
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu");
		
	}

	@Override
	public void maisVolume() {
		if(this.isLigado() == true && this.getVolume() < 100) {
			
			this.setVolume( this.getVolume() + 5);
			
			System.out.println(this.getVolume());
			for (int i = 0; i<this.getVolume();i = i + 5) {
			
				System.out.print("|");
			}
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.isLigado() == true && this.getVolume() > 0) {
			
			this.setVolume( this.getVolume() - 5 );
			
			System.out.println(this.getVolume());
			for(int i = 0 ; i<this.getVolume(); i = i+5) {
				
				System.out.print("|");
			}
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() == true && this.getVolume()>0) {
			
			this.setVolume(0);
			System.out.println(this.getVolume());
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() == true && this.getVolume() == 0) {
			
			this.setVolume(50);
			System.out.println(this.getVolume());
		}
		
	}

	@Override
	public void play() {
		if(this.isLigado() == true && this.isTocando() == false) {
			
			this.setTocando(true);
			
			System.out.println("Play... tocando: " + this.isTocando());
		}
		
	}

	@Override
	public void pause() {
		if(this.isLigado() == true && this.isTocando() == true) {
			
			this.setTocando(false);
			
			System.out.println("Pause... tocando: " + this.isTocando());
		}
		
	}

}
