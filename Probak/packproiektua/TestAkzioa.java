package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAkzioa {
	Akzioa a1;

	@Before
	public void setUp() throws Exception {
		a1=new Akzioa("Hitz egin",1);
	}

	@After
	public void tearDown() throws Exception {
		a1=null;
	}

	@Test
	public void testBerdinakDira() {
		assertTrue(a1.berdinakDira());
	}

	@Test
	public void testAkzioaBurutu() {
		fail("Not yet implemented");
	}

	@Test
	public void testMugitu() {
		fail("Not yet implemented");
	}

}
