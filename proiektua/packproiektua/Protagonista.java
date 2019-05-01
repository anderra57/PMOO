package packproiektua;

public class Protagonista extends Pertsonaia{
	private String izena;
	private int pv;
	private int x;
	private int y;
	private int fue;
	private int intel;
	private int car;
	private int ataq;
	private ListaAkzioa listaA;
	private Inbentarioa listaI;
	private Egoera egoera;
	private static Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena){
		super(pIzena);
		this.listaA= new ListaAkzioa();
		this.listaI= new Inbentarioa();
	}
	
	public static Protagonista getNireProtagonista(String pIzena){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(pIzena);
		}
		return nireProtagonista;
	}
	
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	
	public void objetuaErabili(String pObjIz){
	
	}
	
	public void posizioazAldatu(int pX, int pY){
		this.x=pX;
		this.y=pY;
	}
	
	public int xArdatzaLortu(){
		return this.x;
	}
	public void hasierakoPosizioa(){
			Saloia saloia = Saloia.getNireSaloia();
			saloia.setPertsonaiaMatrizean(x,y);
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
	
	public int getAtaq(){
		return this.ataq;
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