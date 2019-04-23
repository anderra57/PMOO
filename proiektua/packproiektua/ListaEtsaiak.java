package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

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
	
	public void etsaiakAtera(){ //gauzak faltan
		
		Etsaia etsaia = null;
		while(itr.hasNext()){
			etsaia = itr.next();
			//aqui cogemos todos los etsaiak de la lista y los metemos en posiciones aleatorias de la matriz//
		}
	}
	
	public void etsaiakSortu(){
		int etskont = 0;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		while (etskont<lista.size()){
			Random rnd=new Random();
			int rx=rnd.nextInt(18)+1;
			int ry=rnd.nextInt(18)+1;
			if(!ListaGordelekuak.okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				ets = new Etsaia(rx,ry);
				etskont++;
			}
		}
	}
}
