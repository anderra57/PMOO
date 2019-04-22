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
	private Protagonista nireProtagonista = null;
	
	private Protagonista(String pIzena,ListaAkzioak pListaA,Inbentarioa pListaI){
		super();
		this.izena=pIzena;
		this.listaA=new ListaAkzioak();
		this.listaI=new Inbentarioa().getNireInbentarioa();
	}
	
	public Protagonista nireProtagonista(){
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
		int egoera= Egoera.egungoEgoeraLortu();
		if(egoera == 1){
			//aqui ponemos en que posicion queremos que empiece el personaje en la matriz correspondiente a cada egoera//
		}
		if(egoera == 2){
			
		}
		if(egoera == 3){
			
		}
	}
}