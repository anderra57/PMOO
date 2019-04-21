package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class Inbentarioa {
	private ArrayList<Objetua>lista;
	private Inbentarioa nireInbentarioa = null;
	
	private Inbentarioa(){
		this.lista = new ArrayList<Objetua>();
	}
	
	public Inbentarioa getNireInbentarioa(){
		if(nireInbentarioa==null){
			nireInbentarioa = new Inbentarioa();
		}
		return nireInbentarioa;
	}
	
	private Iterator<Objetua> getIteradorea(){
		return this.lista.iterator();
	}
	public Objetua objetuaBilatu(Objetua pObjetua){
		Objetua objetu = null;
		boolean aurkitua = false;
		Iterator<Objetua> itr = this.getIteradorea();
		while(!aurkitua && itr.hasNext()){
			objetu = itr.next();
			if(objetu == pObjetua){
				aurkitua = true;
			}
		}
		if(!aurkitua){
			return null;
		}
		else{
			return objetu;
		}
	}

	public void objetuaErabili(Objetua pObjetua){
		//1.aukera, e implementar desde las herencias
		Objetua objetua = this.objetuaBilatu(pObjetua);
		objetua.objetuaErabili();
		//2.aukera, sin implementar en las herencias (mas facil creo)
		if(pObjetua instanceof Kapela){
			//subir la carisma del protagonista
		}
		else if(pObjetua instanceof Likorea){
			//subir la defensa del protagonista
		}
		else if(pObjetua instanceof Pitia){
			//subir la vida del protagonista
		}
		//llamamos directamente al metodo de protagonista ya que es una EMA
	}
}
