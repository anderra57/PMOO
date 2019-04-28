package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEgoerak {
	private ArrayList<Egoera> lista;
	private static ListaEgoerak nireListaEgoerak = null;
	
	private ListaEgoerak(){
		this.lista = new ArrayList<Egoera>();
	}
	public static ListaEgoerak nireListaEgoerak(){
		if(nireListaEgoerak == null){
			nireListaEgoerak = new ListaEgoerak();
		}
		return nireListaEgoerak;
	}
	private Egoera egoeraAukeratu(){
		Egoera e=null;
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Iterator<Egoera>itr=this.getIteradorea();
		while(itr.hasNext()&&lag>0){
			e=itr.next();
			lag--;
		}
		return e;
		
	}
	private Iterator<Egoera> getIteradorea(){
		return this.lista.iterator();
	}
	
	private void inprimatuAkzioak(){
		Egoera e=this.egoeraAukeratu();
		e.printeatuEgoerarenAukerak();		
	}
}
