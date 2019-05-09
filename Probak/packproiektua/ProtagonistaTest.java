package packproiektua;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProtagonistaTest {
	Protagonista p;

	@Before
	public void setUp() throws Exception {
		p=Protagonista.hasieratuProtagonista("DefektuzkoIzena");
	}

	@After
	public void tearDown() throws Exception {
		p=null;
	}

	@Test
	public void testGetX() {
		assertEquals(p.getX(),0,2);
	}

	@Test
	public void testGetY(){
		assertEquals(p.getY(),0,2);
	}

	@Test
	public void testHasieratuProtagonista() {
		assertNotNull(Protagonista.hasieratuProtagonista("DefektuzkoIzena"));
	}

	@Test
	public void testGetNireProtagonista() {
		assertNotNull(Protagonista.getNireProtagonista());
	}

	@Test
	public void testObjetuaErabili() {
		
		//pitia erabiltzen badu
		p.objetuaErabili("Pitia");
		assertEquals(p.getPv(),260,5);
		
		//kapela
		p.objetuaErabili("Kapela");
		assertEquals(p.getDef(),105);
		
		//Likorea
		p.objetuaErabili("Likorea");
		assertEquals(p.getDef(),95);
		assertEquals(p.getPv(),260);
	}

	@Test
	public void testPosizioazAldatu() {
		p.posizioazAldatu(5, 5);
		assertEquals(p.getY(),5,2);
		assertEquals(p.getX(),5,2);
	}

	@Test
	public void testGetPv() {
		assertEquals(p.getPv(),250,2);
	}

	@Test
	public void testGetAtaq() {
		assertEquals(p.getAtaq(),100,2);
	}

	@Test
	public void testGetDef(){
		assertEquals(p.getDef(),100,2);
	}

	@Test
	public void testSetPv() {
		p.setPv(10);
		assertEquals(p.getPv(),10,2);
	}

	@Test
	public void testSetAtaq() {
		p.setAtaq(10);
		assertEquals(p.getAtaq(),10,2);
	}

	@Test
	public void testSetDef() {
		p.setDef(10);
		assertEquals(p.getDef(),10,2);
	}

	@Test
	public void testSetIzena() {
		p.setIzena("Clint");
		String str="Clint";
		assertEquals(p.getIzena(),str);
	}

	@Test
	public void testGetIzena() {
		String str="DefentuzkoIzena";
		assertEquals(p.getIzena(),str);
	}

	@Test
	public void testHasierakoPosizioa() {
		
		//hilerria
		p.hasierakoPosizioa(2);
		assertEquals(p.getX(),14,2);
		assertEquals(p.getY(),1,2);
		
		//saloia 
		p.hasierakoPosizioa(1);
		assertEquals(p.getX(),18,2);
		assertEquals(p.getY(),15,2);
		
		//banketxea
		p.hasierakoPosizioa(3);
		assertEquals(p.getX(),18,2);
		assertEquals(p.getY(),8,2);
	}
}
