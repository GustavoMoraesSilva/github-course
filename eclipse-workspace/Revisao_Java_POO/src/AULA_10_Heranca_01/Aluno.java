package AULA_10_Heranca_01;

//"Aluno extends Pessoa" -> Aluno será uma classe filha da classe abstrata Pessoa
//Aluno herdará atributos e métodos da classe Pessoa mas terá também seu atributos e métodos próprios
//Final -> A classe Aluno NÃO terá classes filhas
public final class Aluno extends Pessoa {

	int matricula;
	String curso;
	
	//Método Construtor
	public Aluno(String nome,int idade, String sexo, int matricula, String curso) {
		
	this.setNome(nome);
	this.setIdade(idade);
	this.setSexo(sexo);
	this.setMatricula(matricula);
	this.setCurso(curso);
		
	}
	
	
	
	private int getMatricula() {
		return matricula;
	}
	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	private String getCurso() {
		return curso;
	}
	private void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//Métodos próprios da classe Aluno (nesse caso apenas 1)
	
	public void cancelar_matricula() {
		
		this.setMatricula(00000);
		System.out.println("A mátricula do aluno " + this.getNome() + " foi cancelada");
	}
	
	
}
