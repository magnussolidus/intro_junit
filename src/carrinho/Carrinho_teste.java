package carrinho;

import produto.Produto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class Carrinho_teste {

	private final Carrinho chart = new Carrinho();
	
	@Test
	void totalValue(ArrayList<Produto> itens)
	{
		double _total = 0;
		assertNotNull(itens);
		
		Produto[] _clone = new Produto[itens.size()]; 
		itens.toArray(_clone);
		
		for(int i=0; i<_clone.length; i++)
		{
			assertNotNull(_clone[i]);
			assertNotEquals(0.0d, _clone[i].getPreco());
			_total += _clone[i].getPreco();
		}
		
		assertEquals(_total, chart.getValorTotal());
	}
	
	@Test
	void newItem(ArrayList<Produto> itens, Produto desiredItem)
	{
		assertNotNull(itens);
		assertTrue(itens.contains(desiredItem));
	}
	
	@Test
	void itemRemoval(ArrayList<Produto> itens, Produto desiredItem)
	{
		assertNotNull(itens);
		assertFalse(itens.contains(desiredItem));
	}
	
	@Test
	void checkSize(ArrayList<Produto> itens)
	{
		assertNotNull(itens);
		assertEquals(itens.size(), chart.getQtdeItems());
	}
	
	@Test
	// Deve ser chamado para testar o carrinho depois que ele for esvaziado
	void isEmpty(ArrayList<Produto> itens)
	{
		assertNotNull(itens);
		assertTrue(itens.size() == 0);
	}
	
}
