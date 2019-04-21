package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAkzioa {

	private ArrayList<Akzioa> lista;
	private Protagonista prota1;
	
	
	public ListaAkzioa(){
		this.lista = new ArrayList<Akzioa>();
	}
	
	private Iterator<Akzioa> getIteradorea(){
		return this.lista.iterator();
	}
	
	public Akzioa printeatuAkzioa(){
		Akzioa akzioa = null;
		Iterator<Akzioa> itr = this.getIteradorea();
		while(itr.hasNext()){
			akzioa = itr.next();
			akzioa.akzioaBurutu();
		}
		//return akzioa;
		//yo devolveria un void (vamos nada), en vez de una akzioa ya que al fin y al cabo queremos imprimir una akzioa//
	}
	public Akzioa akzioaAukeratu(){
		
	}
	
}
