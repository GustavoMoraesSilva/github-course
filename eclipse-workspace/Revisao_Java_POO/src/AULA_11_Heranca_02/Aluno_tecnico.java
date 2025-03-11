package AULA_11_Heranca_02;

//Extends -> A classe Aluno_tecnico é filha da classe Aluno que é filha da classe pessoa
//Final -> A classe não gerará classes filhas
//Tem também seus atributos e métodos próprios (somados com o da classe mãe)
//É um caso de HERANÇA PARA DIFERENÇA
public final class Aluno_tecnico extends Aluno {
	
	int registro_profissional;
	
	
	//Método Construtor
	//super -> parte do construtor que foi herdada de sua super-classe (classe mãe)
	public Aluno_tecnico(String nome, int idade, String sexo, int matricula, String curso,int registro_profissional) {
		
		super(nome,idade,sexo,matricula,curso);
		
		this.setRegistro_profissional(registro_profissional);
		
	}


	protected int getRegistro_profissional() {
		return registro_profissional;
	}


	protected void setRegistro_profissional(int registro_profissional) {
		this.registro_profissional = registro_profissional;
	}
	
	
	//Métodos próprios da classe (nesse caso apenas 1)
	public void praticar() {
		
		System.out.println("O aluno técnico " + this.getNome() + " está praticando");
	}
}
