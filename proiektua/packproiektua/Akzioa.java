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
		Boolean giltza=false;
		Protagonista p=Protagonista.getNireProtagonista();
		if(this.ident==1){
			if(dialogoaBurutu()){
				fitxeroaErakutsi("Tabernaria_T");
			}
			else{
				fitxeroaErakutsi("Tabernaria_F");
			}
		}
		else{
			if(this.ident==2){
				if(dialogoaBurutu()){
					fitxeroaErakutsi("Prostituta_T");
				}
				else{
					fitxeroaErakutsi("Prostituta_F");
				}
			}
			else{
				if(this.ident==3){
					fitxeroaErakutsi("GizonZaharra");
				}
				else{
					if(this.ident==4){
						if(lag==1830){
							fitxeroaErakutxi("Kutxagogorra");
						}
						else{
							System.out.println("Kutxagogorra irekitzen sailatu zara baina ez da ezer gertatu...");
						}
					}
					else{
						if(this.ident==5){
							fitxeroaErakutxi("Ehorzlea");
						}
						else{
							if(this.ident==6){
								fitxeroaErakutxi("Apaiza");
								giltza=true;
							}
							else{
								if(this.ident==7){
									if(giltza){
										fitxeroaErakutxi("Eliza_T");
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
											p.objektuaErabili("Pitia");
										}
										else{
											if(this.ident==10){
												p.objektuaErabili("Kapela");
											}
											else{
												if(this.ident==11){
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
	
	private void mugitu(){
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Protagonista p=Protagonista.getNireProtagonista;
		int x=p.xArdatzaLortu();
		int y=p.yArdatzaLortu();
		if(lag==1){
			if(y+1<=30){
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
					if(x+1<=30){
						p.posizioaAldatu(x+1,y);
					}
				}
			}
		}
	}
}
