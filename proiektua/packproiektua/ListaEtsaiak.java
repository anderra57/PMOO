package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private Etsaia[] lista;
	
	public ListaEtsaiak(){
		this.lista = new Etsaia[7];
	}
	
	
	public void etsaiakSortu(){
		int etskont = 0;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		Banketxea banketxe = Banketxea.getNireBanketxea();
		while (etskont<7){
			Random rnd=new Random();
			int rx=rnd.nextInt(18)+1;
			int ry=rnd.nextInt(18)+1;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				banketxe.setEtsaiakMatrizean(rx, ry);
				etskont=etskont+1;		
			}
		}
	}
}
