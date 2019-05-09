package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProtagonistaTest {
	Protagonista p;
	Objetua o1;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPertsonaiaEguneratu() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() {
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getX();
		assertEquals(lag,0,2);
	}

	@Test
	public void testGetY() {
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getY();
		assertEquals(lag,0,2);
	}

	@Test
	public void testHasieratuProtagonista() {
		assertNotNull(Protagonista.hasieratuProtagonista("DefektuzkoIzena"));
	}

	@Test
	public void testGetNireProtagonista() {
		fail("Not yet implemented");
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
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getPv();
		assertEquals(lag,0,2);
	}

	@Test
	public void testGetAtaq() {
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getAtaq();
		assertEquals(lag,100,2);
	}

	@Test
	public void testGetDef() {
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getDef();
		assertEquals(lag,100,2);
	}

	@Test
	public void testSetPv() {
		
	}

	@Test
	public void testSetAtaq() {
		Protagonista.hasieratuProtagonista("DefektuzkoIzena").setAtaq(10);
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getAtaq();
		assertEquals(lag,10,2);
	}

	@Test
	public void testSetDef() {
		Protagonista.hasieratuProtagonista("DefektuzkoIzena").setDef(10);
		int lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getDef();
		assertEquals(lag,10,2);
	}

	@Test
	public void testSetIzena() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIzena() {
		String lag=Protagonista.hasieratuProtagonista("DefektuzkoIzena").getIzena();
		assertEquals(lag,"DefektuzkoIzena",lag);
	}

	@Test
	public void testHasierakoPosizioa() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstalita() {
		fail("Not yet implemented");
	}

}
