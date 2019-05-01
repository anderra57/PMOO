package packproiektua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Akzioa {
	private String izena;
	private int ident;
	private boolean kutxa;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public int  getIdent(){
		return this.ident;
	}
	public boolean kutxa(){
		boolean kutxa_da=true;
		return kutxa_da;
	}
	public void akzioaBurutu() throws FileNotFoundException, IOException{
		
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Boolean giltza=false; //Apaizarekin hitz egin eta gero true bihurtuko da
		Protagonista p=Protagonista.getNireProtagonista();
		if(this.ident==1){
			System.out.println("Tabernariarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
			if(dialogoaBurutu()){
				FitxeroakIrakurri.fitxeroaErakutsi("Tabernaria_T");
				ListaAkzioa listaAk = new ListaAkzioa();
				listaAk.setKutxaT();
			}
			else{
				FitxeroakIrakurri.fitxeroaErakutsi("Tabernaria_F");
			}
		}
		else{
			if(this.ident==2){
				System.out.println("Prostitutarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
				if(dialogoaBurutu()){
					FitxeroakIrakurri.fitxeroaErakutsi("Prostituta_T");
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("Prostituta_F");
				}
			}
			else{
				System.out.println("Gizon zaharrarenga hurbidu zara...");
				if(this.ident==3){
					FitxeroakIrakurri.fitxeroaErakutsi("GizonZaharra");
				}
				else{
					if(this.ident==4){
						System.out.println("Kutxagogorrera hurbildu zara eta irekitzeko gako bat behar duela ikusten duzu...");
						int gakoa=zenbakiaLortu();
						if(gakoa==1830){
							FitxeroakIrakurri.fitxeroaErakutsi("Kutxagogorra");
							ListaEgoerak.getNireListaEgoerak().egoeraEguneratu(2); //hurrengo egoerara pasatuko da
						}
						else{
							System.out.println("Kutxagogorra irekitzen saiatu zara baina ez da ezer gertatu...");
						}
					}
					else{
						if(this.ident==5){
							System.out.println("Ehorzlearengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
							FitxeroakIrakurri.fitxeroaErakutsi("Ehorzlea");
						}
						else{
							if(this.ident==6){
								System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
								FitxeroakIrakurri.fitxeroaErakutsi("Apaiza");
								giltza=true;
							}
							else{
								if(this.ident==7){
									if(giltza){
										FitxeroakIrakurri.fitxeroaErakutsi("Eliza_T");
										ListaEgoerak.getNireListaEgoerak().egoeraEguneratu(3); //hurrengo egoerara pasatuko da
									}
									else{
										FitxeroakIrakurri.fitxeroaErakutsi("Eliza_F");
									}
								}
								else{
									if(this.ident==8){
										tiroEgin();
									}
									else{
										if(this.ident==9){
											System.out.println("Pitia erabili duzu");
											p.objetuaErabili("Pitia");
										}
										else{
											if(this.ident==10){
												System.out.println("Kapela erabili duzu");
												p.objetuaErabili("Kapela");
											}
											else{
												if(this.ident==11){
													System.out.println("Likorea erabili duzu");
													p.objetuaErabili("Likorea");
												}
												else{
													mugitu();
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	private boolean dialogoaBurutu(){
		Boolean burutu=false;
		Dadoa d=new Dadoa(6);
		d.bota();
		if(Protagonista.getNireProtagonista().getCar()+d.getGoikoAldea()>=6) {
			burutu=true;
		}
		return burutu;
	}
	private void tiroEgin(){
		int indarra=Protagonista.getNireProtagonista().getIndarra();
		int atq=Protagonista.getNireProtagonista().getAtaq();
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	public void mugitu(){
		try{
			int lag=noranzkoaLortu();
			Protagonista p=Protagonista.getNireProtagonista();
			Saloia saloia = Saloia.getNireSaloia();
			int x=p.getX();
			int y=p.getY();
			if(lag==1){
				if(y+1<=19){
					if(y==18) {
						System.out.println("Sartu duzun balioa ez da egokia...");
					}
					if(saloia.matrizekoBalioa(x, y+1)=='@'){
						System.out.println("Sartu duzun balioa ez da egokia...");
					}
					else{
					p.posizioazAldatu(x,y+1);
					}
				}
			}
			else{
				if(lag==2){
					if(y-1>=0){
						if(y==1) {
							System.out.println("Sartu duzun balioa ez da egokia...");
						}
						if(saloia.matrizekoBalioa(x, y-1)=='@'){
							System.out.println("Sartu duzun balioa ez da egokia...");
						}
						else{
						p.posizioazAldatu(x,y-1);
						}
					}
				}
				else{
					if(lag==3){
						if(x-1>=0){
							if(x==1) {
								System.out.println("Sartu duzun balioa ez da egokia...");
							}
							if(saloia.matrizekoBalioa(x-1, y)=='@'){
								System.out.println("Sartu duzun balioa ez da egokia...");
							}
							else{
							p.posizioazAldatu(x-1,y);
							}
						}
					}
					else{
						if(x+1<=19){
							if(x>=18) {
								System.out.println("Sartu duzun balioa ez da egokia...");
							}
							else if(saloia.matrizekoBalioa(x+1, y)=='@'){
								System.out.println("Sartu duzun balioa ez da egokia...");
							}
							else{
							p.posizioazAldatu(x+1,y);
							}
						}
					}
				}
			}
		}
		catch(BalioEzEgokia lag){
			System.out.println("Sartu duzun balioa ez da egokia...");
			this.mugitu();
		}
	}
	
	private int zenbakiaLortu(){
		boolean lortuta=false;
		try{
			int lag=Teklatua.getNireTeklatua().irakurriZenb();
			lortuta=true;
			return lag;
		}
		catch(NumberFormatException lag){
			System.out.println("Benetan badakizu zenbakiak nola diren?");
			return this.zenbakiaLortu();
		}
	}
	
	private int noranzkoaLortu() throws BalioEzEgokia{
		char lag=Teklatua.getNireTeklatua().irakurriChar();
		int emaitza=0;
		if((lag=='D')||(lag=='d')){
			emaitza=1;
		}
		else{
			if((lag=='A')||(lag=='a')){
				emaitza=2;
			}
			else{
				if((lag=='W')||(lag=='w')){
					emaitza=3;
				}
				else{
					if((lag=='S')||(lag=='s')){
						emaitza=4;
					}
					else {
						throw new BalioEzEgokia();
					}
				}
			}
		}
		return emaitza;
	}
}
