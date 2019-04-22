package packproiektua;

public class Akzioa {
	private String izena;
	private int ident;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public void akzioaBurutu(){
		//dialogoarekin zerikusia duen akzioa
		if(this.ident==1){
			dialogoaBurutu();
		}
		else{
			//mugitu
			if(this.ident==2){
				Protagonista.nireProtagonista().posizioazAldatu(pX, pY);
			}
			else{
				//tiro egin
				if(this.ident==3){
					tiroEgin();
				}
				else{
					if(this.ident==4){
						Protagonista.nireProtagonista().obJektuaErabili(pObjektua);
					}
				}
			}
		}
	}
	private void dialogoaBurutu(){
		Dadoa d=new Dadoa(6);
		d.bota();
		if(Protagonista.nireProtagonista().getCar()+d.getGoikoAldea()) {
			//irakurri dagokion mezua
		}
		else{
			//irakurri dagokion mezua
		}
	}
	private void tiroEgin(){
		int indarra=Protagonista.nireProtagonista().getInd();
		int atq=Protagonista.nireProtagonista().getAtq();
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	
	public void setIdent(int pIdent){
		this.ident=pIdent;
	}
}
