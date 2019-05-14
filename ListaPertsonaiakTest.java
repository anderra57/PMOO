package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaPertsonaiakTest {
	Pertsonaia p1,p2,p3;

	@Before
	public void setUp() throws Exception {
		p1=new Pertsonaia("Pertsonaia1");
		p2=new Pertsonaia("Pertsonaia2");
		p3=new Pertsonaia("Pertsonaia1");
		ListaPertsonaiak.nireListaPertsonaiak().gehituPertsonaia(p1);
		ListaPertsonaiak.nireListaPertsonaiak().gehituPertsonaia(p2);
		ListaPertsonaiak.nireListaPertsonaiak().gehituPertsonaia(p3);
	}

	@After
	public void tearDown() throws Exception {
		ListaPertsonaiak.nireListaPertsonaiak().erreseteatu();
	}

	@Test
	public void testNireListaPertsonaiak() {
		assertNotNull(ListaPertsonaiak.nireListaPertsonaiak());
	}

	@Test
	public void testPertsonaiaZehaztu() {
		assertEquals(ListaPertsonaiak.nireListaPertsonaiak().pertsonaiaZehaztu(),p3);
	}

	@Test
	public void testPertsonaiaBerdina() {
		assertTrue(ListaPertsonaiak.nireListaPertsonaiak().pertsonaiaBerdina(p1));
	}

	@Test
	public void testOkupatutaDago() {
		fail("Not yet implemented");
	}

}
