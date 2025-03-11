package AULA_11_Heranca_02;

public class Principal {
	public static void main(String[] args) {
		
		Aluno_bolsista Aluno_1 = new Aluno_bolsista("Marcos Silva", 15, "M", 1234, "Informática", 20);
		
		Aluno_1.fazer_aniversario();
		Aluno_1.pagar_mensalidade();
		Aluno_1.renovar_bolsa();
		Aluno_1.pagar_mensalidade();
		
		Visitante Visitante_1 = new Visitante("Joana Chaves", 15, "F");
		
		Visitante_1.fazer_aniversario();
	    
	}
}
