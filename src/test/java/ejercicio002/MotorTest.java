package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {

	Motor motor;
	
	@BeforeEach
	void setUp() throws Exception {
		motor=new Motor();
	}

	@Test
	void testEncenderEntre20Y40() {
		int potencia=motor.encender();
		assertTrue(20<=potencia && potencia<=40, "La potencia tiene que estar entre 20 y 40");
	}
	
	@Test
	void testEncenderMayor20() {
		int potencia=motor.encender();
		assertFalse(20>potencia , "La potencia tiene que ser mayor que 20");
	}
	
	@Test
	void testEncenderMenor40() {		
		int potencia=motor.encender();
		assertFalse(40<potencia , "La potencia tiene que ser menor que 40");
	}

}
