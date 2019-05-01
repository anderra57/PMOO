package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class Inbentarioa {
	private ArrayList<Objetua>lista;
	
	public Inbentarioa(){
		this.lista = new ArrayList<Objetua>();
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
		int gehiketa = 0;
		//2.aukera, sin implementar en las herencias (mas facil creo)
		if(pObjetua instanceof Kapela){
			gehiketa = Protagonista.getNireProtagonista().getCar() + 10;
			Protagonista.getNireProtagonista().setKarismaBerria(gehiketa);
		}
		else if(pObjetua instanceof Likorea){
			gehiketa = Protagonista.getNireProtagonista().getIntel() + 10;
			Protagonista.getNireProtagonista().setInteligentziaBerria(gehiketa);
		}
		else if(pObjetua instanceof Pitia){
			gehiketa = Protagonista.getNireProtagonista().getPv() + 15;
			Protagonista.getNireProtagonista().setBizitzaBerria(gehiketa);
		}
		
	}
}
