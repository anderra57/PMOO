package packproiektua;

public abstract class Egoera {
	private String deskribapena;
	private ListaAkzioak lista;
	private int idEgoera;
	private static Egoera nireEgoera = null;
	
	public Egoera(String pDeskribapena, ListaAkzioak pLista){
		this.deskribapena = pDeskribapena;
		this.lista = new ListaAkzioak();
	}
	public static Egoera getNireEgoera(){
		if(nireEgoera == null){
			nireEgoera = new Egoera();
		}
		return nireEgoera;
	}
	
	public void egoeraInprimatu(){
		System.out.println(this.deskribapena);
	}
	public void ezsenatokiaInprimatu(Egoera pEgoera){
		if(pEgoera instanceof Hilerria){
			//Mapa de hilerria
		}
		else{
			if(pEgoera instanceof Saloia){
				//Mapa de saloia
			}
			else{
				//Mapa de banketxea
			}
		}
	}
	public int egungoEgoeraLortu(){
		return this.idEgoera;
	}
	public void printeatuEgoerarenAukerak(){
		ListaAkzioak l=new ListaAkzioak();
		l.akzioakZehaztu();
		l.printeatuAkzioa();
	}
}
