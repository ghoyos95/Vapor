package principal;
import logros.*;

public class Main {

	public static void main(String[] args) {
		
		Avance avance1 = new Avance(2,1);
		Avance avance2 = new Avance(10,2);
		Avance avance3 = new Avance(15, 3);
		
		Jugador maritoBaracus = new Jugador();
		
		maritoBaracus.agregarLogro(avance1);
		maritoBaracus.agregarLogro(avance2);
		maritoBaracus.agregarLogro(avance3);
		
		System.out.println(maritoBaracus.gemas());
		

	}

}
