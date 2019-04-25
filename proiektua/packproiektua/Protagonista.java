package packproiektua;

public class Protagonista extends Pertsonaia{
	private String izena;
	private int pv;
	private int x;
	private int y;
	private int fue;
	private int des;
	private int con;
	private int intel;
	private int sab;
	private int car;
	private ListaAkzioa listaA;
	private Inbentarioa listaI;
	private static Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena,ListaAkzioa pListaA,Inbentarioa pListaI){
		super(pIzena);
		this.listaA=new ListaAkzioa();
		this.listaI= Inbentarioa.getNireInbentarioa();
	}
	
	public static Protagonista nireProtagonista(String pIzena,ListaAkzioa pListaA,Inbentarioa pListaI){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(pIzena,pListaA,pListaI);
		}
		return nireProtagonista;
	}
	
	public void pertsonaiaEguneratu(Akzioa pAkzioa){
		
	}
	
	public void objetuaErabili(int pObjIz){
		
	}
	
	public void posizioazAldatu(int pX, int pY){
		
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
	
	public void hasierakoPosizioa(){
		int egoera= Egoera.getNireEgoera().egungoEgoeraLortu();
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
	public void setInteligentziaBerria(int pBatuketa){
		this.intel = pBatuketa;
	}
	public boolean estalita(){
		boolean bai = false;
		ListaGordelekuak gorde= new ListaGordelekuak();
		Egoera e= new Egoera();
		int egungoEgoera = e.egungoEgoeraLortu();
		
		
		if(egungoEgoera==1){
			//lortu saloiko gordelekuak
		}
		else if(egungoEgoera==2){
			//lortu hilerriko gordelekuak
		}
		else if(egungoEgoera==3){
			//lortu banketxeko gordelekuak
		}
		
		
		if(gorde.okupatutaDago(x,y)){
			bai = true;
		}
		return bai;
	}
}