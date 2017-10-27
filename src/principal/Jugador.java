package principal;

import logros.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Jugador {
	
	private List<Logro> logros=new ArrayList<>();
	private List<Juego> juegos;
	private int plata;
	
	public int gemas() {
		 return logros.stream().mapToInt(logro->logro.gemas()).sum();
		 
	}
	
	public void agregarLogro(Logro unLogro) {
		this.logros.add(unLogro);
	}
	
//#punto 2
	public void comprar(Juego unJuego) {
		
		if (this.juegoRepetido(unJuego) ) 
			{ throw new RuntimeException("El juego está repetido"); }
		
		if (this.alcanzaPlata(unJuego)) {
			throw new RuntimeException ("No alcanza la plata"); }
		
		if(this.plata < unJuego.getPrecio()) {
			this.venderGemas();
		}
		
		this.plata -= unJuego.getPrecio();
		
		this.agregarJuego(unJuego);
		
	}

	
//Estos metodos son útiles para "comprar()"	
	public boolean juegoRepetido(Juego unJuego) {
		return juegos.contains(unJuego);
		
	}
	
	
	public boolean alcanzaPlata(Juego unJuego) {
		return this.gemas() + this.plata > unJuego.getPrecio();
	}
	
	public void venderGemas() {
		this.plata += this.gemas();
	}
	
	public void agregarJuego(Juego unJuego) {
		juegos.add(unJuego);	
	}
	
	
//#punto3 
	public List<Juego> juegosQueDieronLogrosImportantes(){
		return this.juegosImportantes().map(logro->logro.getJuegoQueTeOtorgo());
	}
	
	
	public List<Logro> juegosImportantes() {
		
		return this.logros.stream().filter(logro-> logro.sosImportante()).collect(Collectors.toList());
	}
	
	
	public List<Juego> juegosParaAlardear(){
		return this.juegosQueDieronLogrosImportantes().stream().filter(juego->juego.sosRosita()).collect(Collectors.toList());
	}
	
	
	
	
	
	
}
