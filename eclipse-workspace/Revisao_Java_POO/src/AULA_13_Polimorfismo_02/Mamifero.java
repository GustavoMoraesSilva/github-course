package AULA_13_Polimorfismo_02;

//Extends -> Mamifero é classe filha da classe Animal
public class Mamifero extends Animal{

		private String cor_pelo;

		
		//Método construtor
		public Mamifero(double peso, int idade, int membros,String cor_pelo) {
			//super -> parte do método construtor que foi herdado de sua super classe (classe mãe)
			super(peso,idade,membros);
			
			this.setCor_pelo(cor_pelo);
		}
		
		
		
		//Métodos getters e setters
		protected String getCor_pelo() {
			return cor_pelo;
		}

		protected void setCor_pelo(String cor_pelo) {
			this.cor_pelo = cor_pelo;
		}



		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void locomover() {
			
			System.out.println("Correndo");
		}



		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void alimentar() {
			
			System.out.println("Mamando");
		}



		@Override // -> Sobreposição, o método já existe mas será modificado para esta classe
		public void emitir_som() {
			
			System.out.println("Som de mamífero");
		}
	
}