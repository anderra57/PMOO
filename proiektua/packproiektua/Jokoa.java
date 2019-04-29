package packproiektua;

public class Jokoa {
	private Egoera egungoEgoera;
	private Pertsonaia egungoPertsonaia;
	
	public Jokoa(Egoera pEgungoEgoera, Pertsonaia pEgungoPertsona){
		this.egungoEgoera=pEgungoEgoera;
		this.egungoPertsonaia=pEgungoPertsona;
	}
	
	public void partidaJokatu(){
		Protagonista p1=Protagonista.getNireProtagonista("Sd");
		p1.hasierakoPosizioa();
		ListaAkzioa l1 =ListaAkzioa.getNireListaAkzioa();
		l1.listaAkzioakSortu(egungoEgoera);
		ListaEgoerak legoera =ListaEgoerak.getNireListaEgoerak();
		legoera.hasieratuEgoerak();
	}
	
	private void hasieratuEgoerak(){
		ListaEgoerak le=ListaEgoerak.getNireListaEgoerak();
		le.hasieratuEgoerak();
	}
}
