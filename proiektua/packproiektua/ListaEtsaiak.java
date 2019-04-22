package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEtsaiak {
	
	private ArrayList<Etsaia> lista;
	
	public ListaEtsaiak(){
		this.lista = new ArrayList<Etsaia>();
	}
	
	private Iterator<Etsaia> getIteradorea(){
		return this.lista.iterator();
	}
	
	public Etsaia EtsaiakAtera(){
		Iterator<Etsaia> itr = this.getIteradorea();
		Etsaia etsaia = null;
		while(itr.hasNext()){
			etsaia = itr.next();
			//aqui cogemos todos los etsaiak de la lista y los metemos en posiciones aleatorias de la matriz//
		}
		return etsaia;
	}
}
