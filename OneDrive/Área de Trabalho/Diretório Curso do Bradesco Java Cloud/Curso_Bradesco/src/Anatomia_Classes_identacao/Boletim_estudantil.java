package Anatomia_Classes_identacao;

public class Boletim_estudantil {
	public static void main(String[] args) {
		
		double nota_A1;
		double nota_A2;
		boolean aprovado;
		
		
		
		nota_A1 = 9;
		nota_A2 = 8.3;
		
		double media = (nota_A1 + nota_A2)/2;
		
		
			if(media>= 6 & media<8) {
				
				aprovado = true;
				System.out.println("Parabéns, você foi aprovado!");
				System.out.println("Nota final: " + media);
				
			}
			if(media>= 8) {
					
				aprovado = true;
				System.out.println("Parabéns você foi aprovado com honra ao mérito!");
				System.out.println("Nota final: " + media);
					
				}
			if(media<6) {
						
				aprovado = false;
				System.out.println("Você foi reprovado");
				System.out.println("Nota final: " + media);
				}
			}
		}
