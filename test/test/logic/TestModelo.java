package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

public class TestModelo {
	
	private Modelo modelo;
	private static int CAPACIDAD=100;
	
	@Before
	public void setUp1() {
		modelo= new Modelo(CAPACIDAD);
	}

	public void setUp2() {
		for(int i =0; i< CAPACIDAD;i++){
			modelo.agregar(""+i);
		}
	}

	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(0, modelo.darTamano());  // Modelo con 0 elementos presentes.
	}

	@Test
	public void testDarTamano()
	{
		// TODO
		setUp1();
		setUp2();
		assertTrue(CAPACIDAD== modelo.darTamano());
	}

	@Test
	public void testAgregar() 
	{
		// TODO Completar la prueba
		setUp1();
		setUp2();
		assertEquals(CAPACIDAD +1, modelo.darTamano() + 1);
	}

	@Test
	public void testBuscar() {
		setUp2();
		for (int i = 0; i < CAPACIDAD; i++)
		{
			assertEquals(i, modelo.buscar("" + i));
			
		}
		// TODO Completar la prueba
	}

	@Test
	public void testEliminar() {
		setUp2();
		setUp1();
		assertEquals(null, modelo.eliminar("" +300));
		assertTrue(modelo.eliminar(""+ 1).compareTo(""+ 1) ==0);
		
		// TODO Completar la prueba
		
	}

}
