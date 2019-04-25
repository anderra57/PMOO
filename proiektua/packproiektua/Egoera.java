package packproiektua;

import java.util.Iterator;

public abstract class Egoera {
	private String deskribapena;
	private ListaAkzioa lista;
	private int idEgoera;
	private static Egoera nireEgoera = null;
	private ListaGordelekuak lista1;
	
	public Egoera(String pDeskribapena, ListaAkzioa pLista){
		this.deskribapena = pDeskribapena;
		this.lista = new ListaAkzioa();
	}
	/*
	public static Egoera getNireEgoera(){
		if(nireEgoera == null){
			nireEgoera = new Egoera();
		}
		return nireEgoera;
	}*/
	
	public void egoeraInprimatu(){
		System.out.println(this.deskribapena);
	}
	public void ezsenatokiaInprimatu(Egoera pEgoera){
		if(pEgoera instanceof Hilerria){
			//Mapa de hilerria
		}
		else{
			if(pEgoera instanceof Saloia){
				//Mapa de saloia
			}
			else{
				//Mapa de banketxea
			}
		}
	}
	public int egungoEgoeraLortu(){
		return this.idEgoera;
	}
	public void printeatuEgoerarenAukerak(){
		ListaAkzioa l=new ListaAkzioa();
		l.akzioaAukeratu();
		l.printeatuAkzioa();
	}
	
	public void Inprimatu(ListaGordelekuak lista1){
		int x = 0;
		int y = 0;
		Gordelekua gordelekua = null;
		Iterator<Gordelekua> itr = lista1.getIteradorea();
		while(itr.hasNext()){
			gordelekua = itr.next();
			x = gordelekua.getX();
			y = gordelekua.getY();
		}
	}
}
