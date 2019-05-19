package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProtagonistaTest {
	Protagonista p=Protagonista.getNireProtagonista();

	@Before
	public void setUp() throws Exception {
		p.hasieratuProtagonista("Proba");
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testHasieratuProtagonista() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNireProtagonista() {
		assertNotNull(p.getNireProtagonista());
	}

	@Test
	public void testObjetuaErabili() {
		fail("Not yet implemented");
	}

	@Test
	public void testPosizioazAldatu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPv() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAtaq() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDef() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPv() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAtaq() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDef() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIzena() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIzena() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasierakoPosizioa() {
		
		//Lehenengo Egoeran (Saloia)
		p.hasierakoPosizioa(1);
		assertEquals(p.getX(),18);
		assertEquals(p.getY(),15);
		
		//Bigarren egoeran (hilerria)
		p.hasierakoPosizioa(2);
		assertEquals(p.getX(),14);
		assertEquals(p.getY(),1);
		
		//Hirugarren egoeran (banketxea)
		p.hasierakoPosizioa(3);
		assertEquals(p.getX(),18);
		assertEquals(p.getY(),8);
	}

	@Test
	public void testEstalita() {
		fail("Not yet implemented");
	}

}
