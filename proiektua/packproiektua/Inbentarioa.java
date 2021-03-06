package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class Inbentarioa {
	private ArrayList<Objetua>lista;
	private static Inbentarioa nireInbentarioa = null;
	
	private Inbentarioa(){
		this.lista = new ArrayList<Objetua>();
	}
	public static Inbentarioa getNireInbentarioa(){
		if(nireInbentarioa==null){
			nireInbentarioa=new Inbentarioa();
		}
		return nireInbentarioa;
	}
	
	
	private Iterator<Objetua> getIteradorea(){
		return this.lista.iterator();
	}
	private void ObjetuaGehitu(Objetua pObjetua){
		this.lista.add(pObjetua);
	}
	
	public Inbentarioa inbentarioaSortu(){
		Inbentarioa inb = Inbentarioa.getNireInbentarioa();
		
		Kapela obj = new Kapela();
		inb.ObjetuaGehitu(obj);
		Pitia obj1 = new Pitia();
		inb.ObjetuaGehitu(obj1);
		Likorea obj2 = new Likorea();
		inb.ObjetuaGehitu(obj2);
		return inb;
	}

	public void objetuaErabili(String pObjetua){
		Iterator<Objetua> itr = this.getIteradorea();
		boolean aurkitua=false;
		Protagonista p = Protagonista.getNireProtagonista();
		Objetua objetua=null;
		
		while(itr.hasNext() && !aurkitua){
			objetua=itr.next();
			if((objetua.getIzena()==pObjetua) && (objetua instanceof Likorea)){
				aurkitua = true;
				p.setPv(p.getPv()+100);
			}
			else if((objetua.getIzena()==pObjetua) && (objetua instanceof Kapela)){
				aurkitua = true;
				p.setPv(p.getPv()+50);
			}
			else if((objetua.getIzena()==pObjetua) && (objetua instanceof Pitia)){
				aurkitua = true;
				p.setPv(p.getPv()+10);
			}
		
		}
		if(!aurkitua){
			System.out.println("Ez da zure objetua aurkitu inbentarioan");
		}
	}
	
	
}
