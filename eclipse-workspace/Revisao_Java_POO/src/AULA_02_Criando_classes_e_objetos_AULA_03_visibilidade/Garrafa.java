package AULA_02_Criando_classes_e_objetos_AULA_03_visibilidade;

public class Garrafa {

	//Atributos(características) de uma garrafa
	//Configurando a visibilidade (public, protected, private)
   public double tamanho;
   protected String material;
   private boolean aberta;
   protected String cor;
   private double quantidade_agua;
	
	//Métodos(ações) de uma garrafa
    //Configurando a visibilidade dos métodos(public, protected, private)
	public void tampar() {
		
		//O atributo "aberta" é privado porém o método "tampar" que modifica esse atributo é público
		//Então o "tampar" é uma alternativa para modificar o "aberta"
		if(this.aberta = true) {
			
		
			this.aberta = false;
			System.out.println("A garrafa foi tampada");
			System.out.println("");
	
	    }	
	
		else {
			System.out.println("A garrafa já está tampada");
			System.out.println("");
	}
 }
	public int beber() {
		
		int terminar = 0;
		if (this.quantidade_agua > 0.250) {
			
		this.quantidade_agua -= 0.250;
		System.out.println("A água da garrafa foi tomada, a quantidade diminui um pouco");
		System.out.println("");
		return terminar;
		
		} 
		if(this.quantidade_agua <= 0.250 && this.quantidade_agua > 0) {
			
			this.quantidade_agua -= this.quantidade_agua;
			System.out.println("Foi tomada toda a água da garrafa");
			return terminar;
		}
		
		if(this.quantidade_agua == 0) {
			
			System.out.println("Não é possível beber a água da garrafa, pois ela já acabou");
		}
		return terminar;
	}
	
	private void status() {
		
		System.out.println("Tamanho da garrafa (litros): " + this.tamanho);
		System.out.println("Material da garrafa: " + this.material);
		System.out.println("A garrafa está aberta? " + this.aberta);
		System.out.println("Cor da garrafa: " + this.cor);
		System.out.println("Quantidade de água (litros): " + this.quantidade_agua);
		System.out.println("");
 }
}