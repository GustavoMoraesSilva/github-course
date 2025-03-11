package AULA_11_Heranca_02;

//Extends -> Aluno é classe filha da classe pessoa
//A classe Aluno não tem "final" porque também terá classes filhas dela
//Tem também seus atributos e métodos próprios (somados com o da classe mãe)
//É um caso de HERANÇA PARA DIFERENÇA
public class Aluno extends Pessoa {

	int matricula;
	String curso;
	
	//Método construtor
	//Terá o "super" porque parte de seu método construtor vem da sua super-classe (classe mãe)
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		
		super(nome,idade,sexo);
		
	    this.setMatricula(matricula);
	    this.setCurso(curso);
	    
	}
	

	
	protected int getMatricula() {
		return matricula;
	}

	protected void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	protected String getCurso() {
		return curso;
	}

	protected void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//Métodos próprios (nesse caso apenas 1)
	
	public void pagar_mensalidade() {
		
		System.out.println("A mensalidade de 1500 R$ foi paga");
	}
}
