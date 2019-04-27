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
			this.lista[idx]= etsaiakSortu();
			idx = idx + 1;
		}
	}
	
	public void etsaiakSortu(){
		int etskont = 0;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		while (etskont<7){
			Random rnd=new Random();
			int rx=rnd.nextInt(18)+1;
			int ry=rnd.nextInt(18)+1;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				new Etsaia().setMatrizean(rx, ry);
				etskont++;
			}
		}
	}
}
