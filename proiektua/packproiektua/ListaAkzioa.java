package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAkzioa{

	private ArrayList<Akzioa> lista;
	private Protagonista prota1;
	private static ListaAkzioa nireListaAkzioa = null;
	
	private ListaAkzioa(){
		this.lista = new ArrayList<Akzioa>();
	}
	public static ListaAkzioa getNireListaAkzioa(){
		if(nireListaAkzioa==null){
			nireListaAkzioa = new ListaAkzioa();
		}
		return nireListaAkzioa;
	}
	
	private Iterator<Akzioa> getIteradorea(){
		return this.lista.iterator();
	}
	
	public void printeatuAkzioa(){
		Akzioa akzioa = null;
		Iterator<Akzioa> itr = this.getIteradorea();
		while(itr.hasNext()){
			akzioa = itr.next();
			akzioa.akzioaInprimatu();
		}
	}
	
	public void akzioaAukeratuEtaBurutu(){
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		int parametroa=Teklatua.getNireTeklatua().irakurriZenb();
		Akzioa a=null;
		Iterator<Akzioa>itr=this.getIteradorea();
		while(itr.hasNext()&&lag>0){
			a=itr.next();
			a.setIdent(parametroa);
			lag--;
		}
		a.akzioaBurutu();
	}
	
	private void akzioaGehitu(Akzioa pAkzioa){
		this.lista.add(pAkzioa);
	}
	
	public ListaAkzioa listaAkzioakSortu(Egoera pEgoera){
		ListaAkzioa l=new ListaAkzioa();
		Akzioa a=null;
		if(pEgoera instanceof Hilerria){
			a=new Akzioa("Ehorzlearekin hitz egin",5);
			l.akzioaGehitu(a);
			a=new Akzioa("Apaizarekin hitz egin",6);
			l.akzioaGehitu(a);
			a=new Akzioa("Elizan sartu",7);
			l.akzioaGehitu(a);
		}
		else{
			if(pEgoera instanceof Saloia){
				a=new Akzioa("Tabernariarekin hitz egin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Prostitutarekin hitz egin",2);
				l.akzioaGehitu(a);
				a=new Akzioa("Gizon zaharrarekin",3);
				l.akzioaGehitu(a);
				a=new Akzioa("Kutxagogorrera hurbildu",4);
				l.akzioaGehitu(a);
			}
			else{ //Banketxea
				a=new Akzioa("Tiro egin",8);
				l.akzioaGehitu(a);
				a=new Akzioa("Pitia erabili",9);
				l.akzioaGehitu(a);
				a=new Akzioa("Kapela erabili",10);
				l.akzioaGehitu(a);
				a=new Akzioa("Likorea erabili",11);
				l.akzioaGehitu(a);
				a=new Akzioa("Mugitu",12);
				l.akzioaGehitu(a);
			}
		}
		return l;
	}
}