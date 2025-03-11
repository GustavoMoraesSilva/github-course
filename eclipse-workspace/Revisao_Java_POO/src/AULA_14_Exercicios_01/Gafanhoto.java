package AULA_14_Exercicios_01;




//Extends -> Gafanhoto é classe filha da classe pessoa
public class Gafanhoto extends Pessoa{


	
	
	private String login;
	private long totAssistido;
	
		//Método construtor
		public Gafanhoto(String nome, int idade, String sexo, int experiencia,String login, long totAssistido) {
			//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
			
			super(nome,idade,sexo,experiencia);
			
			
		}

		protected String getLogin() {
			return login;
		}

		protected void setLogin(String login) {
			this.login = login;
		}

		protected long getTotAssistido() {
			return totAssistido;
		}

		protected void setTotAssistido(long totAssistido) {
			this.totAssistido = totAssistido;
		}
		
		
		//Método adicional
		//Ele vai pesquisar o nome de um vídeo nos objetos vídeos e verificar se algum deles tem o mesmo nome da busca
		//1. Digitar o nome do vídeo procurado
		//2. Verificar se esse vídeo existe
		//3. Assistir vídeo (dando play para seguir e pause para pausar)
		public void viuMaisUm() {
			
			this.setTotAssistido(this.getTotAssistido() + 1);
		}
}
