package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PertsonaiaTest {
	Pertsonaia p1,p2;

	@Before
	public void setUp() throws Exception {
		Pertsonaia p1=new Pertsonaia("DefektuzkoIzena");
	}

	@After
	public void tearDown() throws Exception {
		Pertsonaia p1=null;
	}


	@Test
	public void testGetX() {
		Pertsonaia p1=new Pertsonaia("DefektuzkoIzena");
		assertEquals(p1.getX(),0);
	}

	@Test
	public void testGetY() {
		Pertsonaia p1=new Pertsonaia("DefektuzkoIzena");
		assertEquals(p1.getY(),0);
	}

}
