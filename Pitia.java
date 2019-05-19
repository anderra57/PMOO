package packproiektua;

public class Pitia extends Objetua{

	public Pitia(){
		super("Pitia");
	}
	
	public void objektuaErabili(){
		//Pitia p=new Pitia("Pitia");
		Inbentarioa inb=Inbentarioa.getNireInbentarioa();
		inb.objetuaErabili("Pitia");
	}
	
}
