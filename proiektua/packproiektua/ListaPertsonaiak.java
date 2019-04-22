package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPertsonaiak {
	private ArrayList<Pertsonaia> lista;
	private ListaPertsonaiak nireListaPertsonaiak = null;
	
	private ListaPertsonaiak(){
		this.lista = new ArrayList<Pertsonaia>();
	}
	public ListaPertsonaiak nireListaPertsonaiak(){
		if(nireListaPertsonaiak == null){
			nireListaPertsonaiak = new ListaPertsonaiak();
		}
		return nireListaPertsonaiak;
	}
	private Iterator<Pertsonaia> getNireIteradorea(){
		return this.lista.iterator();
	}
	public Pertsonaia pertsonaiaZehaztu(){
		Pertsonaia pertsonaia = null;
		return pertsonaia;
	}
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	public boolean pertsonaiaBerdina(Pertsonaia pPertsonaia){
		boolean berdina = false;
		Iterator<Pertsonaia> itr = this.getNireIteradorea();
		Pertsonaia pertsonaia = null;
		while(itr.hasNext() && !berdina){
			pertsonaia = itr.next();
			if(pertsonaia == pPertsonaia){
				berdina = true;
			}
		}
		return berdina;
	}
}
