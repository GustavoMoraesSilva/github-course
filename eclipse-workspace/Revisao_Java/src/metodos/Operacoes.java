package metodos;

public class Operacoes {

	//Função de uma operação de soma
	
   static int soma (int a, int b) {
    	
     int s = a+b;
    	return s;
    }
	
   //Criando uma nova função soma, só que melhorada e de tipo String
   
   static String soma2(int a, int b) {
	   
	   String texto  = "";
	   int s = a + b;
	   texto = "O resultado de " + a + " + " + b + " é igual a: " + s;
	   System.out.println(texto);
	   return texto;
   }
   
   //Criando um Contador
   
   static int Contador(int inicio, int fim) {
	int contador;
	
	System.out.println("CONTANDO:");
	   for(contador = inicio; contador <=fim; contador++) {
		   
		   System.out.println(contador);
		   
	   }
	   System.out.println("Fim da contagem");
	   return contador;
   }
   
   static int fatorial(int f) {
	
	   int contador;
	   
	   for(contador = f; contador < 0; contador--) {
		   
		   System.out.println(contador);
		   
	   }
	   return contador;
	   
   }
   
}
