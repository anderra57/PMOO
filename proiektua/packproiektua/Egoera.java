package packproiektua;

import java.util.ArrayList;

import java.util.Iterator;

public abstract class Egoera {
	private String deskribapena;
	private ListaAkzioa lista;
	private int idEgoera;
	private static Egoera nireEgoera = null;
	private ListaGordelekuak lista1;
	
	public Egoera(String pDeskribapena){
		this.deskribapena = pDeskribapena;
		this.lista=ListaAkzioa.getNireListaAkzioa();
		this.lista1=ListaGordelekuak.getNireListaGordelekuak();
	}

	public void egoeraInprimatu(){
		System.out.println(this.deskribapena);
	}
	public void ezsenatokiaInprimatu(Egoera pEgoera){
		if(pEgoera instanceof Hilerria){
			fitxeroaErakutsi("Hilerria");
		}
		else{
			if(pEgoera instanceof Saloia){
				fitxeroaErakutsi("Saloia");
			}
			else{
				fitxeroaErakutsi("Banketxea");
			}
		}
	}
	public int egungoEgoeraLortu(){
		return this.idEgoera;
	}
	public void printeatuEgoerarenAukerak(){
		ListaAkzioa l=ListaAkzioa.getNireListaAkzioa();
		if(this.idEgoera==1){
			l.listaAkzioaAukeratu(Saloia);
		}
		else{
			if(this.idEgoera==2){
				l.listaAkzioaAukeratu(Hilerria);
			}
			else{
				if(this.idEgoera==3){
					l.listaAkzioaAukeratu(Banketxea);
				}
			}
		}
		l.printeatuAkzioa();
		l.akzioaAukeratuEtaBurutu();
	}
	
	public void hasieratu(){
		this.lista.clear();
		ListaAkzioa l=ListaAkzioa.getNireListaAkzioa();
		l.listaAkzioakSortu(nireEgoera);
		this.lista=l;
	}
}