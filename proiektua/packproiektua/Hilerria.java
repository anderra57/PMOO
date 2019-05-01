package packproiektua;

public class Hilerria extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private static Hilerria nireHilerria = null;
	private ListaAkzioa lista;
	
	private Hilerria(String pDeskribapena){
		super(pDeskribapena);
		this.idEgoera=2;
		this.matrizea = new char[20][20];
	}
	public static Hilerria getNireHilerria(){
		if(nireHilerria==null){
			nireHilerria = new Hilerria("Hilerria");
		}
		return nireHilerria;
	}
	public ListaAkzioa getLista(){
		return this.lista.listaAkzioakSortu(nireHilerria);
		
	}
	
	public void eszenatokiaInprimatu(){
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  if(i==0 || i==19){
					  this.matrizea[i][j]='+';
					  this.matrizea[15][15]='#';
				  }
				  else if(j==0 || j==19){
					  this.matrizea[i][j]='+';
				  }
				  else{
					  this.matrizea[i][j]='-';
				  }
			  }
		}
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
	}
}
