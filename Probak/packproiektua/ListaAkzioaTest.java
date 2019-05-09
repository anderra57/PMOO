package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaAkzioaTest {
	ListaAkzioa ls,lh,lb;

	@Before
	public void setUp() throws Exception {
		ls.listaAkzioakSortu(1);
		lh.listaAkzioakSortu(2);
		lb.listaAkzioakSortu(3);
	}

	@After
	public void tearDown() throws Exception {
		ls.erreseteatu();
		lh.erreseteatu();
		lb.erreseteatu();
	}

	@Test
	public void testGetEliza() {
		
		assertFalse(lh.getEliza());
		lh.setElizaT();
		assertTrue(lh.getEliza());
	
	}

	@Test
	public void testGetMugitu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMugitu1() {
		fail("Not yet implemented");
	}

	@Test
	public void testAkzioaAukeratuEtaBurutu() {
		fail("Not yet implemented");
	}

	@Test
	public void testListaAkzioakSortu() {
		fail("Not yet implemented");
	}

}
