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
				Protagonista.getNireProtagonista.posizioazAldatu();
			}
			else{
				//tiro egin
				if(this.ident==3){
					tiroEgin();
				}
				else{
					if(this.ident==4){
						Protagonista.getNireProtagonista.obJektuaErabili(pObjektua);
					}
				}
			}
		}
	}
	private void dialogoaBurutu(){
		Dadoa d=new Dadoa(6);
		d.bota();
		if(Protagonista.getNireProtagonista.getCar()+d.getGoikoAldea()) {
			//irakurri dagokion mezua
		}
		else{
			//irakurri dagokion mezua
		}
	}
	private void tiroEgin(){
		int indarra=Protagonista.getNireProtagonista.getInd();
		int atq=Protagonista.getNireProtagonista.getAtq();
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	
	public void setIdent(int pIdent){
		this.ident=pIdent;
	}
}
