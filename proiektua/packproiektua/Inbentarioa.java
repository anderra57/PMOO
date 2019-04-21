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
	public Objetua objetuaBilatu(Objetua pObjetua){
		Objetua objetu = null;
		return objetu;
	}

	public void objetuaErabili(int pObjIz){
		//HOLA//
	}
}
