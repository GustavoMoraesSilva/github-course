package AULA_09_Exercicio_pratico;

import java.util.Random;

//A classe "Livro" servirá para implementar a interface "Publicacao"
public class Livro implements Publicacao {

	//Atributos da classe livro
	private String titulo;
	private Pessoa autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//*** Autor e Leitor serão atributos do tipo Pessoa
	//*** Então existe uma relação de agregação
	//*** A classe "Livro" é agregada da classe "Pessoa"
	
	//Método construtor
	public Livro(String titulo, Pessoa autor, int totPaginas, Pessoa leitor) {
		
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPaginas(totPaginas);
		//O livro começará na página 0
		this.setPagAtual(0);
		//O livro começará fechado
		this.setAberto(false);
		this.setLeitor(leitor);
		
	}

	//Métodos getters e setters
	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private Pessoa getAutor() {
		return autor;
	}

	private void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	private int getTotPaginas() {
		return totPaginas;
	}

	private void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	private int getPagAtual() {
		return pagAtual;
	}

	private void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	private boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	private Pessoa getLeitor() {
		return leitor;
	}

	private void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
	//Métodos da Interface
	public void abrir() {
		
		if(this.isAberto() == true) {
			
			System.out.println("O livro já está aberto");
		}
		
		else if (this.isAberto() == false) {
			
			this.setAberto(true);
			System.out.println("O livro foi aberto");
}
	}
	public void fechar() {
		
		if(this.isAberto() == false) {
			
			System.out.println("O livro já está aberto");
		}
		
		else if(this.isAberto() ==  true) {
			
			this.setAberto(false);
			System.out.println("O livro foi fechado");
		}
	}
	
	//O método folhear escolherá uma página aleatória do livro
	public void folhear() {
		
		if(this.isAberto() == true) {
			
			Random paginaAleatoria = new Random();
			
			//A página aleatório poderá ser qualquer uma
			//entre 0 e o total de páginas do livro
			int paginaFolheada = paginaAleatoria.nextInt(this.getTotPaginas());
			
			this.setPagAtual(paginaFolheada);
			}
		else if(this.isAberto() == false) {
			
			System.out.println("Não é possível folhear o livro se ele está fechado");
		}
	}
	
	public void avancarPag() {
		
		if(this.isAberto() == true) {
			
			if(this.getPagAtual() < this.getTotPaginas()) {
				
			this.setPagAtual(1 + this.getPagAtual());
			 }
		}
		else if(this.isAberto() == false) {
			
			System.out.println("Não é possível avançar a página se o livro está fechado");
		}
	}
	
	public void voltarPag() {
		
		if(this.isAberto() == true) {
		
			if(this.getPagAtual()> 0) {
				
			this.setPagAtual(1 - this.getPagAtual() );
		 }
		}
		
		else if(this.isAberto() == false) {
			
			System.out.println("Não é possível voltar a página se o livro está fechado");
		}
	}
	
	//Demais métodos ( nesse caso só 1)
	public void detalhes() {
		
		System.out.println("Título do livro: " + this.getTitulo());
		System.out.println("Autor do livro: " + this.getAutor().getNome());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Livro está aberto? " + this.isAberto());
		System.out.println("Leitor: " + this.getLeitor().getNome());
		
		
	}
    

	
}
