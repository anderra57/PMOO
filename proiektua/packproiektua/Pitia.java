package packproiektua;

public class Pitia extends Objetua{

	public Pitia(String pIzena, int pPitia){
		super(pIzena);
	}
	
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setBizitzaBerria(p.getPv()-10);
		p.setIndarraBerria(p.getIndarra()+5);
	}
	
}
