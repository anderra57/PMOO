package packproiektua;

public class Pitia extends Objetua{

	private int pitia;
	
	public Pitia(String pIzena, int pPitia){
		super(pIzena);
		this.pitia = pPitia;
	}
	
	public void objetuaErabili(){
		this.pitia = this.pitia + 10;
	}
}
