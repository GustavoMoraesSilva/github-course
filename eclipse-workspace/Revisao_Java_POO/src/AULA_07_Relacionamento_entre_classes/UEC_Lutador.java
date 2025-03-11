package AULA_07_Relacionamento_entre_classes;

public class UEC_Lutador {

	//Atributos de um lutador;
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	//Método construtor
	//Nele está dito que a classe precisará ser instanciada ao ser criada;
	UEC_Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,int empates ){
		
		//A categoria não está aqui
		//Pois ela será definida automaticamente através do peso do lutador
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		
	}
	
	
	
	
	
	
	
	//Métodos Getters e Setters dos atributos de um lutador
	
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getNacionalidade() {
		return nacionalidade;
	}
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	private int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	private double getPeso() {
		return peso;
	}
	private void setPeso(double peso) {
		this.peso = peso;
		//IMPORTANTE
		//O this.setCategoria() tem que ser chamado aqui se não a categoria não é instanciada
		//Lembrando que isso ocorre porque o peso deve instanciar automaticamente a categoria
		//Através do this.setCategoria()
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	
	//A categoria será definida automaticamente
	//Isso será feito com base no peso que o lutador possui
	
	private void setCategoria() {
		
		if(this.getPeso()<52.2) {
			this.categoria = "Inválido (muito leve)";
		}
		else if (this.getPeso()>52.2 && this.getPeso()<=70.3) {
			
			this.categoria = "Leve";
		}
		else if(this.getPeso()>70.3 && this.getPeso()<=83.9) {
			
			this.categoria = "Médio";
		}
		else if(this.getPeso()>83.9 && this.getPeso()<=120.2) {
			
			this.categoria = "Pesado";
		}
		else if(this.getPeso()>120.2) {
			
			this.categoria = "Inválido (muito pesado)";
		}
	}
	
	private int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	private int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	private int getEmpates() {
		return empates;
	}
	private void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	//Criando os demais métodos
	
	void apresentar() {
		
		System.out.println("--APRESENTANDO--");
		System.out.println("Lutando na categoria : " + this.getCategoria());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
	}
	
	void status() {
		
		System.out.println("--STATUS DO LUTADOR--");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("V-D-E: " + this.getVitorias() + "-" + this.getDerrotas() + "-" + this.getEmpates());	
	}
	
	void ganhar_luta() {
		
		this.setVitorias(this.getVitorias() + 1);
		System.out.println(this.getNome() + " ganhou a luta!");
		
	}
	
	void perder_luta() {
		
		this.setDerrotas(this.getDerrotas() + 1);
		System.out.println(this.getNome() + " perdeu a luta!");
		
	}
	
	void empatar_luta() {
		
		this.setEmpates(this.getEmpates() + 1);
		System.out.println("A luta deu empate");
	}
	
	
	
}
