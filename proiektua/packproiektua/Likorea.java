package packproiektua;

public class Likorea extends Objetua{
	
	
	
	public Likorea(String pIzena, int pLikorea){
		super(pIzena);
	
	}
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setBizitzaBerria(p.getPv()+10);
		p.setInteligentziaBerria(p.getIntel()-5);
	}


	
}
