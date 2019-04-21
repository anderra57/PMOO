package packproiektua;

public class Likorea extends Objetua{
	
	private int likorea;
	
	public Likorea(String pIzena, int pLikorea){
		super(pIzena);
		this.likorea = pLikorea;
	}
	
	public void objetuaErabili(){
		this.likorea = this.likorea + 10;
		//hola/
	}

	
}
