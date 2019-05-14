package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InbentarioaTest {
	Inbentarioa inb;
	Objetua oP,oK,oL;
	Protagonista p;

	@Before
	public void setUp() throws Exception {
		inb=Inbentarioa.getNireInbentarioa();
		oP=new Kapela("Pitia");
		oK=new Kapela("Kapela");
		oL=new Likorea("Likorea");
		p=Protagonista.getNireProtagonista();
		inb.inbentarioaSortu();
	}

	@After
	public void tearDown() throws Exception{
		inb=null;
	}

	@Test
	public void testGetNireInbentarioa(){
		assertNotNull(Inbentarioa.getNireInbentarioa());
	}

	@Test
	public void testInbentarioaSortu() {
		assertNotNull(inb);
	}

	@Test
	public void testObjetuaErabili() {
		Protagonista p=Protagonista.getNireProtagonista();
		//Pitia erabiltzen du
		inb.objetuaErabili("Pitia");
		assertEquals(p.getPv(),260,5);
		
		//Likorea erabiltzen badu
		inb.objetuaErabili("Likorea");
		assertEquals(p.getPv(),350,5);
		
		//Kapela erabiltzen badu
		inb.objetuaErabili("Kapela");
		assertEquals(p.getPv(),290,5);
	}

}
