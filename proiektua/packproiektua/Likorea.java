package packproiektua;

public class Likorea extends Objetua{
	
	
	
	public Likorea(String pIzena){
		super(pIzena);
	
	}
	public void objektuaErabili(){
		Protagonista p=Protagonista.getNireProtagonista();
		p.setPv(p.getPv()+100);
	}


	
}
