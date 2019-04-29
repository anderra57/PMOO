package packproiektua;

public class Protagonista extends Pertsonaia{
	private String izena;
	private int pv;
	private int x;
	private int y;
	private int fue;

	private int intel;

	private int car;
	private ListaAkzioa listaA;
	private Inbentarioa listaI;
	private static Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena,ListaAkzioa pListaA,Inbentarioa pListaI){
		super(pIzena);
		this.listaA=ListaAkzioa.getNireListaAkzioa();
		this.listaI= Inbentarioa.getNireInbentarioa();
	}
	
	public static Protagonista getNireProtagonista(String pIzena,ListaAkzioa pListaA,Inbentarioa pListaI){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(pIzena,pListaA,pListaI);
		}
		return nireProtagonista;
	}
	
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	
	public abstract void objetuaErabili(int pObjIz);
	
	public void posizioazAldatu(int pX, int pY){
		this.x=pX;
		this.y=pY;
	}
	
	public int xArdatzaLortu(){
		return this.x;
	}

	public int yArdatzaLortu(){
		return this.y;
	}
	
	public int getIntel(){
		return this.intel;
	}
	
	public int getPv(){
		return this.pv;
	}
	
	public int getCar(){
		return this.car;
	}
	
	public int getIndarra(){
		return this.fue;
	}
	
	public void hasierakoPosizioa(){
		
		if(egoera == 1){
			//aqui ponemos en que posicion queremos que empiece el personaje en la matriz correspondiente a cada egoera//
		}
		if(egoera == 2){
			
		}
		if(egoera == 3){
			
		}
	}
	public void setBizitzaBerria(int pBatuketa){
		this.pv = pBatuketa;
	}
	public void setKarismaBerria(int pBatuketa){
		this.car = pBatuketa;
	}
	public void setIndarraBerria(int pBatuketa){
		this.fue=pBatuketa;
	}
	public void setInteligentziaBerria(int pBatuketa){
		this.intel = pBatuketa;
	}
	public boolean estalita(){
		ListaGordelekuak gorde= ListaGordelekuak.getNireListaGordelekuak();
		boolean bai = false;
		if(gorde.okupatutaDago(x,y)){
			bai = true;
		}
		return bai;
	}
}