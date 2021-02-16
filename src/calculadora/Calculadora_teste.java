package calculadora;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class Calculadora_teste {
	
	private final Calculadora calc = new Calculadora();
	
	@Test
	void addition(int n1, int n2)
	{
		assertNotNull(n1);
		assertNotNull(n2);
		assertEquals(n1+n2, calc.soma(n1, n2));
	}
	
	@Test
	void subtraction(int n1, int n2)
	{
		assertNotNull(n1);
		assertNotNull(n2);
		assertEquals(n1-n2, calc.subtracao(n1, n2));
	}
	
	@Test
	void multiply(int n1, int n2)
	{
		assertNotNull(n1);
		assertNotNull(n2);
		assertEquals(n1*n2, calc.multiplicacao(n1, n2));
	}
	
	@Test
	void division(int num, int den)
	{
		assertNotNull(num);
		assertNotNull(den);
		assertTrue(calc.ehPositivo(den));
		assertEquals(num/den, calc.divisao(num, den));
	}
	
	@Test
	void summation(int num) // 5 => 0+1+2+3+4+5 = 15
	{
		assertNotNull(num);
		assertTrue(calc.ehPositivo(num));
		if(num > 1)
		{			
			assertNotEquals(num, calc.somatoria(num));
		}
	}
	
	@Test
	void isPositive(int num)
	{
		assertNotNull(num);
		assertTrue(calc.ehPositivo(num));
	}
	
	@Test
	void compares(int n1, int n2)
	{
		assertNotNull(n1);
		assertNotNull(n2);
		if(n1 == n2)
		{
			assertEquals(0, calc.compara(n1, n2));			
		}
		else if(n1 > n2)
		{
			assertEquals(1, calc.compara(n1, n2));
		}
		else // n2 > n1
		{
			assertEquals(-1, calc.compara(n1, n2));
		}
		
	}

}
