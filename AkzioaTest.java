package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AkzioaTest {
	Akzioa a1,a2,a3;

	@Before
	public void setUp() throws Exception {
		a1=new Akzioa("1.Akzioa",1);
		a2=new Akzioa("2.Akzioa",2);
		a3=new Akzioa("3.Akzioa",3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAkzioa() {
		assertNotNull(a1);
	}

	@Test
	public void testGetIdent() {
		
		assertEquals(a1.getIdent(),1);
		assertEquals(a2.getIdent(),2);
		assertEquals(a3.getIdent(),3);
	}

	@Test
	public void testKutxa() {
		
		assertFalse(a1.getKutxa());
		assertFalse(a2.getKutxa());
		assertFalse(a3.getKutxa());
		
		assertTrue(a1.kutxa());
		assertTrue(a2.kutxa());
		assertTrue(a3.kutxa());
	}

	@Test
	public void testBerdinakDira() {
		fail("Not yet implemented");
	}

	@Test
	public void testAkzioaBurutu() {
		a1.akzioaBurutu(1);
		
	}

	@Test
	public void testSetIdent() {
		a1.setIdent(4);
		assertEquals(a1.getIdent(),4);
	}

}
