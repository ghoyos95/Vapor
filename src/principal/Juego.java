package principal;

public class Juego {
	private int precio;
	private int cantSangrePorHora;
	private int dificultad;

	
	public boolean sosRosita() {
		return cantSangrePorHora < 1 || this.dificultad < 2;
	}
	
	
	
	
	
	//Accesors
	public int getPrecio() {
		return precio;
	}
	
	public int getCantSangrePorHora() {
		return cantSangrePorHora;
	}
	
	public int getDificultad() {
		return dificultad;
	}
	
	
	
}
