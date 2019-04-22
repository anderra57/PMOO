package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEgoerak {
	private ArrayList<Egoera> lista;
	private ListaEgoerak nireListaEgoerak = null;
	
	private ListaEgoerak(){
		this.lista = new ArrayList<Egoera>();
	}
	public ListaEgoerak nireListaEgoerak(){
		if(nireListaEgoerak == null){
			nireListaEgoerak = new ListaEgoerak();
		}
		return nireListaEgoerak;
	}
	public Egoera egoeraZehaztu(){
		Egoera egoera = null;
		return egoera;
	}
	private Iterator<Egoera> getIteradorea(){
		return this.lista.iterator();
	}
	
	public void eszenatokiaInprimatu(){
		Egoera egoera = null;
		Iterator<Egoera> itr = this.getIteradorea();
		while(itr.hasNext()){
			egoera = itr.next();
			if(egoera instanceof Hilerria){
				//aqui imprimimos la eszenatokia de hilerria
			}
			else if (egoera instanceof Saloia){
				//aqui imprimimos la eszenatokia de saloia
			}
			else if(egoera instanceof Banketxea){
				//aqui imprimimos la eszenatokia de banketxea
			}
		}
	}
}
