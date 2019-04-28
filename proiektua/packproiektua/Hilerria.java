package packproiektua;

public class Hilerria extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private static Hilerria nireHilerria = null;
	
	private Hilerria(String pDeskribapena){
		super(pDeskribapena);
		this.idEgoera=2;
	}
	public static Hilerria getNireHilerria(){
		if(nireHilerria==null){
			nireHilerria = new Hilerria("Hilerria");
		}
		return nireHilerria;
	}
	public ListaAkzioa getLista(){
		return ListaAkzioa.getNireListaAkzioa().listaAkzioakAukeratu(nireHilerria);
		
	}
	
	public void eszenatokiaInprimatu(){
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  if(i==0 || i==19){
					  matrizea[i][j]='+';
				  }
				  else if(j==0 || j==19){
					  matrizea[i][j]='+';
				  }
				  else{
					  matrizea[i][j]='-';
				  }
			  }
		}
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
	}
}
