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
		this.pv=100;
	}
	
	public static Protagonista hasieratuProtagonista(String pIzena){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(pIzena);
		}
		return nireProtagonista;
	}
	
	public static Protagonista getNireProtagonista(){
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
	
	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	
	public int getIntel(){
		System.out.println("zure inteligentzia "+ this.intel +" da");
		return this.intel;
	}
	
	public int getPv(){
		System.out.println("zure bizitza "+ this.pv +" da");
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
	
	public void setIzena(String pIzena){
		this.izena=pIzena;
	}
	
	public String getIzena(){
		return this.izena;
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
	
	public void hasierakoPosizioa(int pId){
			int id = pId;
			if(id == 2){
				this.posizioazAldatu(14, 1);
				Hilerria hilerri = Hilerria.getNireHilerria();
				hilerri.setPertsonaiaMatrizean();
			}
			if(id == 1){
				this.posizioazAldatu(18,15);
				Saloia saloia = Saloia.getNireSaloia();
				saloia.setPertsonaiaMatrizean();
			}
			if(id == 3){
				this.posizioazAldatu(11, 11);
				Banketxea banketxe = Banketxea.getNireBanketxea();
				banketxe.setPertsonaiaMatrizean();
			}
		
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