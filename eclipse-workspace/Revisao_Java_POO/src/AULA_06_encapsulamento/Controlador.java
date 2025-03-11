package AULA_06_encapsulamento;


//"Controlador" será uma Interface implementada pela classe "Controle_Remoto"
interface Controlador {

	
	//abstract -> Significa que o código não será desenvolido ali dentro
	//Porque será desenvolvido na classe "Controle_Remoto"
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
	
	
	
}
