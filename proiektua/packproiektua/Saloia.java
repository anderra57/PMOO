package packproiektua;

public class Saloia extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private static Saloia nireSaloia = null;
	private ListaAkzioa lista;
	
	private Saloia(String pDeskribapena){
		super(pDeskribapena);
		this.matrizea = new char[20][20];
		this.idEgoera=1;
	}
	public static Saloia getNireSaloia(){
		if(nireSaloia==null){
			nireSaloia = new Saloia("Saloia");
		}
		return nireSaloia;
	}
	public ListaAkzioa getLista(){
		return this.lista.listaAkzioakSortu(1);
		
	}
	
	
	public void eszenatokiaHasieratu(){
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  if(i==0 || i==19){
					  this.matrizea[i][j]='+';
					  this.matrizea[5][5]='@';
					  this.matrizea[5][6]='@';
					  this.matrizea[6][5]='@';
					  this.matrizea[6][6]='@';
					  this.matrizea[16][16]='@';
					  this.matrizea[16][17]='@';
					  this.matrizea[17][16]='@';
					  this.matrizea[17][17]='@';
					  this.matrizea[18][16]='@';
					  this.matrizea[18][17]='@';
					  
				  }
				  else if(j==0 || j==19){
					 this. matrizea[i][j]='+';
				  }
				  else{
					  this.matrizea[i][j]='-';
				  }
			  }
		}
	}
	public void eszenatokiaInprimatu(){
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
	}
	public void setPertsonaiaMatrizean(){
		Protagonista p = Protagonista.getNireProtagonista();
		int x= p.getX();
		int y=p.getY();
		matrizea[x][y]='#';
	}
	public void deletePertsonaiaMatrizetik(int pX, int pY){
		matrizea[pX][pY]='-';
	}
	public char matrizekoBalioa(int x, int y){
		return matrizea[x][y];
	}
	
}
