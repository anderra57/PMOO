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
	private ListaAkzioak listaA;
	private Inbentarioa listaI;
	private static Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena,ListaAkzioak pListaA,Inbentarioa pListaI){
		super();
		this.izena=pIzena;
		this.listaA=new ListaAkzioak();
		this.listaI=new Inbentarioa().getNireInbentarioa();
	}
	
	public static Protagonista nireProtagonista(){
		if(nireProtagonista == null){
			nireProtagonista = new Protagonista(String pIzena,ListaAkzioa pListaA,Inbentarioa pListaI);
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
		if(//aqui pillamos las coordenadas del prota, y los comparamos con las coordenadas de los gordelekuak//){
			bai = true;
		}
		return bai;
	}
}