package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;


public class ListaGordelekuak {

	private ArrayList<Gordelekua> lista;
	
	public ListaGordelekuak(){
		this.lista = new ArrayList<Gordelekua>();
	}
	
	public Iterator<Gordelekua> getIteradorea(){
		return this.lista.iterator();
	}
	
	public boolean okupatutaDago(int pX, int pY){
		boolean okupatuta = false;
		Iterator<Gordelekua> itr = this.getIteradorea();
		Gordelekua gordelekua = null;
		while(itr.hasNext() && !okupatuta){
			gordelekua = itr.next();
			if(gordelekua.getX() == pX && gordelekua.getY() == pY){
				okupatuta = true;
			}
		}
		return okupatuta;
	}
	
	public ArrayList<Gordelekua> getListaGordelekuak(){
		return this.lista;
	}
	
}
