package packproiektua;

public class Kapela extends Objetua{
	
	
	public Kapela(String pIzena, int pKapela){
		super(pIzena);
		
	}
	
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista("Sd");
		p.setInteligentziaBerria(p.getIntel()+5);
	}
	
}
