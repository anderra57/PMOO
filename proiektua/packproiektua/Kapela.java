package packproiektua;

public class Kapela extends Objetua{
	
	private int kapela;
	
	public Kapela(String pIzena, int pKapela){
		super(pIzena);
		this.kapela = pKapela;
	}
	
	public void objetuaErabili(){
		this.kapela = this.kapela + 10;
	}
	
}
