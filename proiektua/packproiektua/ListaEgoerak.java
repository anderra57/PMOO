package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaEgoerak {
	private ArrayList<Egoera> lista;
	private static ListaEgoerak nireListaEgoerak = null;
	
	private ListaEgoerak(){
		this.lista = new ArrayList<Egoera>();
	}
	public static ListaEgoerak getNireListaEgoerak(){
		if(nireListaEgoerak == null){
			nireListaEgoerak = new ListaEgoerak();
		}
		return nireListaEgoerak;
	}
	public Egoera egoeraEguneratu(int pZenb){
		Egoera e=null;
		int lag=pZenb;
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
	
	
	private Egoera egoeraAukeratu(){
		Egoera e=null;
		return e;
	} 
	
	private void inprimatuAkzioak() throws FileNotFoundException, IOException{
		Egoera e=this.egoeraAukeratu();
		e.printeatuEgoerarenAukerak();		
	}
	
	public void hasieratuEgoerak(){
		Iterator<Egoera>itr=this.getIteradorea();
		Egoera e=null;
		while(itr.hasNext()){
			e=itr.next();
			e.hasieratu();
		}
	}
}
