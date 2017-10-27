package logros;
import principal.*;

public class Avance implements Logro{
	private int tiempoJugado;
	private int dificultad;
	private Juego juegoQueTeOtorgo;
	
	public Avance(int unTiempo, int unaDificultad){
		this.tiempoJugado=unTiempo;
		this.dificultad=unaDificultad;
	}
	
	public int gemas() {
		return tiempoJugado * dificultad;
		
	}
	
	public boolean sosImportante() {
		return false;
	}
	
	
	
	//accesors
	
	public Juego getJuegoQueTeOtorgo() {
		return juegoQueTeOtorgo;
	}
	
}
