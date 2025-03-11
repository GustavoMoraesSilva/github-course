package AULA_07_Relacionamento_entre_classes;

public class Principal {

	public static void main(String[] args) {
		
		
		//Criando novos lutadores através de vetores
		UEC_Lutador L[] = new UEC_Lutador [6];
		
		L[0] = new UEC_Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		L[1] = new UEC_Lutador("Putscript", "Brasil",29, 1.68, 57.8, 14, 2, 3);
		L[2] = new UEC_Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		L[3] = new UEC_Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		L[4] = new UEC_Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		L[5] = new UEC_Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		
       UEC_Luta Luta_1 = new UEC_Luta (L[0],L[1], 3);
       
      L[0].status();
      Luta_1.marcar_luta(L[0],L[1]);
      Luta_1.lutar();
      L[0].status();
	}

}
