package testes;

import java.util.Random;

public class Aleatorio {

	public static void main(String[] args) {
		Random numero_aleatorio = new Random();

		for(int i=0;i<20;i++) {
		int recebedor = numero_aleatorio.nextInt(3);
		System.out.println(recebedor);
		
		}
	}

}
