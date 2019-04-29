package packproiektua;

public class Jokoa {
	private Egoera egungoEgoera;
	private Pertsonaia egungoPertsonaia;
	
	public Jokoa(Egoera pEgungoEgoera, Pertsonaia pEgungoPertsona){
		this.egungoEgoera=pEgungoEgoera;
		this.egungoPertsonaia=pEgungoPertsona;
	}
	
	public void partidaJokatu(){
		hasieratuProtagonista();
		hasieratuAkzioak();
	}
	
	private void hasieratuEgoerak(){
		ListaEgoerak le=ListaEgoerak.getNireListaEgoerak();
		le.hasieratuEgoerak();
	}
}
