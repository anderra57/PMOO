package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private ArrayList<Etsaia> lista;
	
	public ListaEtsaiak(){
		this.lista = new ArrayList<Etsaia>();
	}
	private Iterator<Etsaia> getIteradorea(){
		return this.lista.iterator();
	}
	private void etsaiaGehitu(Etsaia pEtsaia){
		this.lista.add(pEtsaia);
	}
	
	public void etsaiakSortu(){
		int etskont = 0;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		Banketxea banketxe = Banketxea.getNireBanketxea();
		while (etskont<7){
			Random rnd=new Random();
			int rx=rnd.nextInt(16)+2;
			int ry=rnd.nextInt(16)+2;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				Etsaia e1 = new Etsaia("Adei");
				this.etsaiaGehitu(e1);
				///adei
				
				
				
				banketxe.setEtsaiakMatrizean(rx, ry);
				etskont=etskont+1;		
			}
			
		}
	}
}
