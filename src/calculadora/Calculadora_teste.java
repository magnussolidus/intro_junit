package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculadora_teste {
	
	private final Calculadora calc = new Calculadora();
	
	@Test
	void addition()
	{
		assertEquals(2, calc.soma(1, 1));
	}

}
