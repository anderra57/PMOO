package packproiektua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Akzioa {
	private String izena;
	private int ident;
	private boolean kutxa;
	private static boolean objetuak1=false;
	private static boolean objetuak2=false;
	private static int kont = 0;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public int getIdent(){
		return this.ident;
	}
	public boolean kutxa(){
		boolean kutxa_da=true;
		return kutxa_da;
	}
	public void setObjetuak1(boolean pO){
		this.objetuak1=pO;
	}
	public void setObjetuak2(boolean pO){
		this.objetuak2=pO;
	}
	public void kont(){
		this.kont=this.kont+1;
	}
	
	public ListaEtsaiak berdinakDira(){
		int px = Protagonista.getNireProtagonista().getX();
		int py = Protagonista.getNireProtagonista().getY();
		Etsaia e = null;
		ListaEtsaiak l1 = Banketxea.getNireBanketxea().lortuEtsaiakBanketxetik();
		ListaEtsaiak l2 = new ListaEtsaiak();
		Iterator<Etsaia> itr = l1.getIteradorea();
		while(itr.hasNext()){
			e = itr.next();
			int ex = e.getX();
			int ey = e.getY();
			if((px==ex)||(py==ey)){
				l2.etsaiaGehitu(e);
			}
		}
		return l2;
	}
	public void akzioaBurutu(int pEgoera) throws FileNotFoundException, IOException{
		
		//int lag=Teklatua.getNireTeklatua().irakurriZenb();
		
		
		Boolean giltza=false; //Apaizarekin hitz egin eta gero true bihurtuko da
		Protagonista p=Protagonista.getNireProtagonista();
		Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	
		
		if(pEgoera==1){
			if(this.ident==1){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(12, 4);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Tabernariarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				if(dialogoaBurutu()){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Tabernaria_T.txt");
					ListaAkzioa listaAk = new ListaAkzioa();
					listaAk.setKutxaT();
					saloia.kutxaAgertu();
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Tabernaria_F.txt");
				}
			}
			else if(this.ident==2){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(4, 16);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Prostitutarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				if(dialogoaBurutu()){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Prostituta_T.txt");
				}
				else{
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Prostituta_F.txt");
				}
			}
			else if(this.ident==3){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 7);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Gizon zaharrarenga hurbidu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Saloia/GizonZaharra.txt");
			}
			else if(this.ident==4){
				
				int preX=p.getX();
		    	int preY=p.getY();
				saloia.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(3, 3);
				saloia.setPertsonaiaMatrizean();
		    	saloia.eszenatokiaInprimatu();
				
				System.out.println("Kutxagogorrera hurbildu zara eta irekitzeko gako bat behar duela ikusten duzu...");
				int gakoa=zenbakiaLortu();
				//String kontra=Integer.toString(gakoa);
				//if(kontra=="1830"){
				if(gakoa==1830){
					FitxeroakIrakurri.fitxeroaErakutsi("Saloia/Kutxagogorra.txt");
					ListaAkzioa l = new ListaAkzioa();
					l.pasatuSaloitikHilerrira(); //hurrengo egoerara pasatuko da
				}
				else{
					System.out.println("Kutxagogorra irekitzen saiatu zara baina ez da ezer gertatu...");
				}
			}
		}
		else if(pEgoera==2){
			if(this.ident==1){
				
				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(8, 2);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				System.out.println("Ehorzlearengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Ehorzlea.txt");
			}
			else if(this.ident==2){

				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 15);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
				FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Apaiza.txt");
				giltza=true;
				ListaAkzioa l = new ListaAkzioa();
				l.setElizaT();
			}
			else if(this.ident==3){

				int preX=p.getX();
		    	int preY=p.getY();
				hilerria.deletePertsonaiaMatrizetik(preX, preY);
				p.posizioazAldatu(7, 12);
				hilerria.setPertsonaiaMatrizean();
				hilerria.eszenatokiaInprimatu();
				
				ListaAkzioa l = new ListaAkzioa();
						if(l.getEliza()){
							FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Eliza_T.txt");
							//ListaEgoerak.getNireListaEgoerak().egoeraEguneratu(3); //hurrengo egoerara pasatuko da
							
							l.pasatuHilerritikBanketxera(); //hurrengo egoerara pasatuko da
						}
						else{
							FitxeroakIrakurri.fitxeroaErakutsi("Hilerria/Eliza_F.txt");
						}
			}	
		}
		else if(pEgoera==3){
			
			if(this.ident==1){
				tiroEgin();
			}
			else if(this.ident==2){
				if(!objetuak1){
				System.out.println("Une honetan duzun bizitza, eraso eta defentsa hurrengoa da:");
				System.out.println("");
				System.out.println("Bizitza: "+p.getPv());
				System.out.println("Erasoa: "+p.getAtaq());
				System.out.println("Defentsa: "+p.getDef());
				System.out.println("");
				p.objetuaErabili("Pitia");
				System.out.println("");
				System.out.println("Pitia erabili duzu eta zure bizitza, erasoa eta defentsa hurrengoa da:");
				System.out.println("");
				System.out.println("Bizitza berria: "+p.getPv());
				System.out.println("Erasoa berria: "+p.getAtaq());
				System.out.println("Defentsa berria: "+p.getDef());
				this.setObjetuak1(true);
				}
				else{
					System.out.println("Pitia ez dago zure inbentarioan");
				}
			}
			else if(this.ident==3){
				if(!objetuak2){
					System.out.println("Une honetan duzun bizitza, eraso eta defentsa hurrengoa da:");
					System.out.println("");
					System.out.println("Bizitza: "+p.getPv());
					System.out.println("Erasoa: "+p.getAtaq());
					System.out.println("Defentsa: "+p.getDef());
					System.out.println("");
					p.objetuaErabili("Kapela");
					System.out.println("");
					System.out.println("Kapela erabili duzu eta zure bizitza, erasoa eta defentsa hurrengoa da:");
					System.out.println("");
					System.out.println("Bizitza berria: "+p.getPv());
					System.out.println("Erasoa berria: "+p.getAtaq());
					System.out.println("Defentsa berria: "+p.getDef());
					this.setObjetuak2(true);
					}
					else{
						System.out.println("Kapela ez dago zure inbentarioan");
					}
			}
			else if(this.ident==4){
				if(this.kont<=1){
					System.out.println("Une honetan duzun bizitza, eraso eta defentsa hurrengoa da:");
					System.out.println("");
					System.out.println("Bizitza: "+p.getPv());
					System.out.println("Erasoa: "+p.getAtaq());
					System.out.println("Defentsa: "+p.getDef());
					System.out.println("");
					p.objetuaErabili("Likorea");
					System.out.println("");
					System.out.println("Likorea erabili duzu eta zure bizitza, erasoa eta defentsa hurrengoa da:");
					System.out.println("");
					System.out.println("Bizitza berria: "+p.getPv());
					System.out.println("Erasoa berria: "+p.getAtaq());
					System.out.println("Defentsa berria: "+p.getDef());
					this.kont();
					}
					else{
						System.out.println("Likorea ez dago zure inbentarioan");
					}
			}

			else if(this.ident==5){
				System.out.println("Norantz nahi duzu mugitu?");
				System.out.println("> W < gorantz joateko");
				System.out.println("> A < ezkerrerantz joateko");
				System.out.println("> S < beherentzat joateko");
				System.out.println("> D < eskuineranz joateko");
				this.mugitu();
			}
		}
			
	}

	private boolean dialogoaBurutu(){
		Boolean burutu=false;
		Dadoa d=new Dadoa(6);
		d.bota();
		/*
		if(Protagonista.getNireProtagonista().getCar()+d.getGoikoAldea()>=6) {
			burutu=true;
		}*/
		if(d.getGoikoAldea()>=3) {
			burutu=true;
		}
		return burutu;
	}
	private void tiroEgin() throws FileNotFoundException, IOException {
		Protagonista p = Protagonista.getNireProtagonista();
		int erasoa=Protagonista.getNireProtagonista().getAtaq();
		int defentsa = Protagonista.getNireProtagonista().getDef();
		int bizitza = Protagonista.getNireProtagonista().getPv();
		ListaEtsaiak l1 = Banketxea.getNireBanketxea().lortuEtsaiakBanketxetik();
		ListaEtsaiak l2 = this.berdinakDira();
		ListaEtsaiak l3=l2.etsaiaHildaBadagoKendu();
		if(l3.luzera()!=0){
			System.out.println("Aukeratu ahal dituzun etsaiak hauek dira: ");
			l2.etsaiakInprimatu();
			System.out.println("Idatzi tirokatu nahi duzun etsaiaren letra");
			this.tiroketa(l2);
		}
		else if(l3.luzera()==0){
			System.out.println();
			System.out.println("Ezin duzu etsairik tirokatu momentu honetan. Egizu beste zeozer");
			System.out.println();
	    	ListaAkzioa listaAkz = new ListaAkzioa();
	    	ListaAkzioa listaAkzB=listaAkz.listaAkzioakSortu(3);
    		listaAkzB.akzioaAukeratuEtaBurutu(3);
		}
		//l1.etsaienBizitzaInprimatu();
		
	}	
	private void tiroketa(ListaEtsaiak pL){	
		try{
		String izena = Teklatua.getNireTeklatua().irakurriString();
		Etsaia e = pL.etsaiaBilatuIzenez(izena);
		if(pL.badago(e)){
			//Ataque del protagonista al etsaia
			e.setBizitza(0);
			System.out.println(e.getIzena() + " hilda dago");
		}
		}
		catch(BalioEzEgokia lag){
			System.out.println("Gaizki sartu duzu etsaiaren izena, sartu berriz...");
			this.tiroketa(pL);
		}
	}
		
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	public void mugitu(){
		try{
			ListaAkzioa l = new ListaAkzioa();
			l.setMugitu(true);
			l.setMugitu1(true);
			int lag=noranzkoaLortu();
			Protagonista p=Protagonista.getNireProtagonista();
			Banketxea banketxea = Banketxea.getNireBanketxea();
			int x=p.getX();
			int y=p.getY();
			if(lag==1){
				if(y+1<=18){
					if(y==17) {
						System.out.println("Sartu duzun balioa ez da egokia...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else if((banketxea.matrizekoBalioa(x, y+1)=='%')||(banketxea.matrizekoBalioa(x, y+1)=='@')){
						System.out.println("Ezin zara hortik pasa...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else if((banketxea.matrizekoBalioa(x, y+1)=='A')||(banketxea.matrizekoBalioa(x, y+1)=='B')||
							(banketxea.matrizekoBalioa(x, y+1)=='C')||(banketxea.matrizekoBalioa(x, y+1)=='D')||
							(banketxea.matrizekoBalioa(x, y+1)=='E')||(banketxea.matrizekoBalioa(x, y+1)=='F')||
							(banketxea.matrizekoBalioa(x, y+1)=='G')){
						System.out.println("Ezin zara etsai baten gainean kokatu...");
						p.posizioazAldatu(x,y);
						System.out.println();
						System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
						System.out.println("> W < gorantz joateko");
						System.out.println("> A < ezkerrerantz joateko");
						System.out.println("> S < beherentzat joateko");
						System.out.println("> D < eskuineranz joateko");
						this.mugitu();
					}
					else{
					p.posizioazAldatu(x,y+1);
					}
				}
			}
			else{
				if(lag==2){
					if(y-1>=1){
						if(y==2) {
							System.out.println("Sartu duzun balioa ez da egokia...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else if((banketxea.matrizekoBalioa(x, y-1)=='%')||(banketxea.matrizekoBalioa(x, y-1)=='@')){
							System.out.println("Ezin zara hortik pasa...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else if((banketxea.matrizekoBalioa(x, y-1)=='A')||(banketxea.matrizekoBalioa(x, y-1)=='B')||
								(banketxea.matrizekoBalioa(x, y-1)=='C')||(banketxea.matrizekoBalioa(x, y-1)=='D')||
								(banketxea.matrizekoBalioa(x, y-1)=='E')||(banketxea.matrizekoBalioa(x, y-1)=='F')||
								(banketxea.matrizekoBalioa(x, y-1)=='G')){
							System.out.println("Ezin zara etsai baten gainean kokatu...");
							p.posizioazAldatu(x,y);
							System.out.println();
							System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
							System.out.println("> W < gorantz joateko");
							System.out.println("> A < ezkerrerantz joateko");
							System.out.println("> S < beherentzat joateko");
							System.out.println("> D < eskuineranz joateko");
							this.mugitu();
						}
						else{
						p.posizioazAldatu(x,y-1);
						}
					}
				}
				else{
					if(lag==3){
						if(x-1>=1){
							if(x==2) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x-1, y)=='%')||(banketxea.matrizekoBalioa(x-1, y)=='@')){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x-1, y)=='A')||(banketxea.matrizekoBalioa(x-1, y)=='B')||
									(banketxea.matrizekoBalioa(x-1, y)=='C')||(banketxea.matrizekoBalioa(x-1, y)=='D')||
									(banketxea.matrizekoBalioa(x-1, y)=='E')||(banketxea.matrizekoBalioa(x-1, y)=='F')||
									(banketxea.matrizekoBalioa(x-1, y)=='G')){
								System.out.println("Ezin zara etsai baten gainean kokatu...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else{
							p.posizioazAldatu(x-1,y);
							}
						}
					}
					else{
						if(x+1<=18){
							if(x==17) {
								System.out.println("Sartu duzun balioa ez da egokia...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x+1, y)=='%')||(banketxea.matrizekoBalioa(x+1, y)=='@')){
								System.out.println("Ezin zara hortik pasa...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
							}
							else if((banketxea.matrizekoBalioa(x+1, y)=='A')||(banketxea.matrizekoBalioa(x+1, y)=='B')||
									(banketxea.matrizekoBalioa(x+1, y)=='C')||(banketxea.matrizekoBalioa(x+1, y)=='D')||
									(banketxea.matrizekoBalioa(x+1, y)=='E')||(banketxea.matrizekoBalioa(x+1, y)=='F')||
									(banketxea.matrizekoBalioa(x+1, y)=='G')){
								System.out.println("Ezin zara etsai baten gainean kokatu...");
								p.posizioazAldatu(x,y);
								System.out.println();
								System.out.println("Berriro galdetuko dizut, norantz nahi duzu mugitu?");
								System.out.println("> W < gorantz joateko");
								System.out.println("> A < ezkerrerantz joateko");
								System.out.println("> S < beherentzat joateko");
								System.out.println("> D < eskuineranz joateko");
								this.mugitu();
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
