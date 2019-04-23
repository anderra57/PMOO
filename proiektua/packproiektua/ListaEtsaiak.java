package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEtsaiak {
	
	private Etsaia[] lista;
	
	public ListaEtsaiak(){
		this.lista = new Etsaia[7];
	}
	
	public void Iteradorea(){
		int idx = 0;
		while(idx<7){
			this.lista[idx]= EtsaiakAtera();
			idx = idx + 1;
		}
	}
	
	public Etsaia EtsaiakAtera(){
		
		Etsaia etsaia = null;
		while(itr.hasNext()){
			etsaia = itr.next();
			//aqui cogemos todos los etsaiak de la lista y los metemos en posiciones aleatorias de la matriz//
		}
		return etsaia;
	}
}
