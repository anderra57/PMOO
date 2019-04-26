package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private Etsaia[] lista;
	
	public ListaEtsaiak(){
		this.lista = new Etsaia[7];
	}
	
	private void Iteradorea(){
		int idx = 0;
		while(idx<7){
			this.lista[idx]= etsaiakAtera();
			idx = idx + 1;
		}
	}
	
	public void etsaiakAtera(){ //gauzak faltan
		
		Etsaia etsaia = null;
		while(itr.hasNext()){
			etsaia = itr.next();
			//aqui cogemos todos los etsaiak de la lista y los metemos en posiciones aleatorias de la matriz//
		}
	}
	
	public void etsaiakSortu(){
		int etskont = 0;
		Etsaia ets = null;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		while (etskont<7){
			Random rnd=new Random();
			int rx=rnd.nextInt(18)+1;
			int ry=rnd.nextInt(18)+1;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				ets = new Etsaia().setMatrizean(rx, ry);
				etskont++;
			}
		}
	}
}
