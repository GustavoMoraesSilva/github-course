package AULA_14_Exercicios_01;

import java.util.List;
import java.util.ArrayList;

//A classe "Video" irá implementar a interface "AcoesVideo"
public class Video implements AcoesVideo{

	private String titulo;
	private String avaliacao;
	private long views;
	private long curtidas;
	private boolean reproduzindo;
	
	
	
		//Método Construtor
        public Video(String titulo, String avaliacao, long views, long curtidas) {
        	
        	this.setTitulo(titulo);
        	this.setAvaliacao(avaliacao);
        	this.setViews(views);
        	this.setCurtidas(curtidas);
        	//Reproduzindo começará como "false" como padrão
        	this.setReproduzindo(false);
        	
        	Assistir.lista_de_videos.add(this);
        }
	
			//Métodos getters e setters
			public String getTitulo() {
					return titulo;
				}
		
				public void setTitulo(String titulo) {
					this.titulo = titulo;
				}

				public String getAvaliacao() {
					return avaliacao;
				}
		
				public void setAvaliacao(String avaliacao) {
					this.avaliacao = avaliacao;
				}
		
				public long getViews() {
					return views;
				}
		
				public void setViews(long views) {
					this.views = views;
				}
		
				public long getCurtidas() {
					return curtidas;
				}
		
				public void setCurtidas(long curtidas) {
					this.curtidas = curtidas;
				}
		
				public boolean isReproduzindo() {
					return reproduzindo;
				}
		
				public void setReproduzindo(boolean reproduzindo) {
					this.reproduzindo = reproduzindo;
				}
		
		

		
	//Métodos que serão utilizado pela interface;
	public void play() {		
		
		this.setReproduzindo(true);
		System.out.println("PLAY");
	}
	
	public void pause() {
		
		this.setReproduzindo(false);
		System.out.println("PAUSE");
	}
	
	public void like() {
	
	this.setCurtidas(this.getCurtidas() + 1);
	System.out.println("LIKE");
	}
	
	
	public void criar_lista_de_videos(Video video) {
		
		lista_de_videos.add(video);
		
	}
}
