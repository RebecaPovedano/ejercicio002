package ejercicio002;


public class Motor {

	private int potencia;
	
	public Motor() {
		potencia=(int) (Math.random()*20+20);
	}
	
	public int encender() {
		return potencia;
	}
}
