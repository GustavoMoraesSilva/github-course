package AULA_02_Criando_classes_e_objetos_AULA_03_visibilidade;

	public class Criando_objetos_garrafa {
		public static void main(String[] args) {
			
			Garrafa garrafa_1 = new Garrafa();
			
			garrafa_1.tamanho = 1.5 ;
			garrafa_1.material = "Plástico";
			garrafa_1.cor = "Azul";
		  //garrafa_1.aberta = true;
	      // garrafa_1.quantidade_de_agua = 0.5;
			
		  //garrafa_1.tampar();
			garrafa_1.beber();
		  //garrafa_1.status();
			
			
		}
}
