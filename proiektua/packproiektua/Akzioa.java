package packproiektua;

public class Akzioa {
	private String izena;
	private int ident;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public void akzioaBurutu(){
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Boolean giltza=false; //Apaizarekin hitz egin eta gero true bihurtuko da
		Protagonista p=Protagonista.getNireProtagonista();
		if(this.ident==1){
			System.out.println("Tabernariarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
			if(dialogoaBurutu()){
				fitxeroaErakutsi("Tabernaria_T");
			}
			else{
				fitxeroaErakutsi("Tabernaria_F");
			}
		}
		else{
			if(this.ident==2){
				System.out.println("Prostitutarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
				if(dialogoaBurutu()){
					fitxeroaErakutsi("Prostituta_T");
				}
				else{
					fitxeroaErakutsi("Prostituta_F");
				}
			}
			else{
				System.out.println("Gizon zaharrarenga hurbidu zara...");
				if(this.ident==3){
					fitxeroaErakutsi("GizonZaharra");
				}
				else{
					if(this.ident==4){
						System.out.println("Kutxagogorrera hurbildu zara eta irekitzeko gako bat behar duela ikusten duzu...");
						int gakoa=Teklatua.getNireTeklatua().irakurriZenb();
						if(gakoa==1830){
							fitxeroaErakutsi("Kutxagogorra");
						}
						else{
							System.out.println("Kutxagogorra irekitzen sailatu zara baina ez da ezer gertatu...");
						}
					}
					else{
						if(this.ident==5){
							System.out.println("Ehorzlearengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
							fitxeroaErakutsi("Ehorzlea");
						}
						else{
							if(this.ident==6){
								System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
								fitxeroaErakutsi("Apaiza");
								giltza=true;
							}
							else{
								if(this.ident==7){
									if(giltza){
										fitxeroaErakutsi("Eliza_T");
									}
									else{
										fitxeroaErakutsi("Eliza_F");
									}
								}
								else{
									if(this.ident==8){
										tiroEgin();
									}
									else{
										if(this.ident==9){
											System.out.println("Pitia erabili duzu");
											p.objektuaErabili("Pitia");
										}
										else{
											if(this.ident==10){
												System.out.println("Kapela erabili duzu");
												p.objektuaErabili("Kapela");
											}
											else{
												if(this.ident==11){
													System.out.println("Likorea erabili duzu");
													p.objektuaErabili("Likorea");
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
		if(Protagonista.nireProtagonista().getCar()+d.getGoikoAldea()>=6) {
			burutu=true;
		}
	}
	private void tiroEgin(){
		int indarra=Protagonista.nireProtagonista().getInd();
		int atq=Protagonista.nireProtagonista().getAtq();
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	private void mugitu(){
		int lag=zenbakia lortu(4);
		Protagonista p=Protagonista.getNireProtagonista;
		int x=p.xArdatzaLortu();
		int y=p.yArdatzaLortu();
		if(lag==1){
			if(y+1<=20){
				p.posizioazAldatu(x,y+1);
			}
		}
		else{
			if(lag==2){
				if(y-1>=0){
					p.posizioaAldatu(x,y-1);
				}
			}
			else{
				if(lag==3){
					if(x-1>=0){
						p.posizioaAldatu(x-1,y);
					}
				}
				else{
					if(x+1<=20){
						p.posizioaAldatu(x+1,y);
					}
				}
			}
		}
	}
}
