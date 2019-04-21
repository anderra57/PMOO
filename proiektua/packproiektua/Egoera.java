package packproiektua;

public abstract class Egoera {
	private String deskribapena;
	private ListaAkzioak lista;
	private int idEgoera;
	
	public Egoera(String pDeskribapena){
		this.deskribapena = pDeskribapena;
		this.lista = new ListaAkzioak();
	}
	public void egoeraInprimatu(){
		
	}
	public void ezsenatokiaInprimatu(){
		
	}
	public int egungoEgoeraLortu(){
		return this.idEgoera;
	}
}
