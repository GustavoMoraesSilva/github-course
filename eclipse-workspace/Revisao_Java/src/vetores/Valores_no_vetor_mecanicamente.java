package vetores;

	public class Valores_no_vetor_mecanicamente {
		public static void main(String[] args){
			
			//criando um vetor de tamanho[3] ou seja, que vai de 0 até 2
			int vetor[] = new int[3];
			
			//preenchendo os valores do vetor, dessa forma -> vetor[posicao] = valor;
			 vetor[0] = 1;
			 vetor[1] = 2;
			 vetor[2] = 3;
			 
			 //Mostrando os valores do vetor, a posição irá aumentar(++) cada vez que o "for" repetir
			 int posicao;
			 
			 for(posicao=0;posicao<vetor.length;posicao++) {
				 
				 System.out.println("posição " + posicao + ": " + vetor[posicao]);
				
			 }
			
			
		}
}
