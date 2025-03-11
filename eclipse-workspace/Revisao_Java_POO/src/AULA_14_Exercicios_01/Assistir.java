package AULA_14_Exercicios_01;

//Biblioteca para criação de lista
import java.util.List;
//Como usar
//Nível visualização List<Coisa que será listada> nome da lista
//Exemplo -> private List <pessoas> lista_de_pessoas

//Biblioteca para criar listas com arrays(vetores)
import java.util.ArrayList;

//Biblioteca para criar um Scanner;
import java.util.Scanner;

public class Assistir {

	//Criando um Scanner
	Scanner leia = new Scanner(System.in);
	
	
	//Relacionamento de agregação
	//A Classe assistir é agregada da classe gafanhoto
	//Porque possui um atributo do tipo Gafanhoto
	private Gafanhoto gafanhoto;
	
	private Video video;
	
	private boolean video_encontrado;

	//Criando uma lista que terá todos os objetos Video
   
 
   

	public static List<Video> lista_de_videos = new ArrayList<>();

	
		//Método Construtor
		public Assistir(Gafanhoto gafanhoto) {
			
			this.setGafanhoto(gafanhoto);
			
			
			
		}
	
	
			//Getters e Setters
			protected Gafanhoto getGafanhoto() {
				return gafanhoto;
			}
			protected void setGafanhoto(Gafanhoto gafanhoto) {
				this.gafanhoto = gafanhoto;
			}

			
			protected boolean isVideo_encontrado() {
				return video_encontrado;
			}


			protected void setVideo_encontrado(boolean video_encontrado) {
				this.video_encontrado = video_encontrado;
			}


			
			//Método de assistir Vídeo
			
			public void assistirVideo(){
				
				String videoProcurado;
				System.out.println("Digite o nome do vídeo procurado");
				videoProcurado = leia.nextLine();
				
				for(Video video : lista_de_videos) {
					if(video.getTitulo().equalsIgnoreCase(videoProcurado)) {
						System.out.println("Vídeo: " + video.getTitulo() + " encontrado" );
						
					
						
						
						
					}
					
				}
				
			}
				
				
				
				
				
			
}
			

