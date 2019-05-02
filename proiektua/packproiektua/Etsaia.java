package packproiektua;

public class Etsaia {
	
	private int pv;
	private static int atq=5;
	private Banketxea banketxea1;

	public Etsaia(){
		this.pv = 100;
		
	}
	
	public void eraso(){
		int emaitza = Protagonista.getNireProtagonista().getPv();
		//En este metodo, lo qeu haria seria, si nuestro personaje esta cubierto, el etsaia nos va a quitar 0 de vida.
		//Si nuestro personaje no esta cubierto, que nos quite (5 o 10) de vida
		if(Protagonista.getNireProtagonista().estalita()){
			emaitza = Protagonista.getNireProtagonista().getPv();
			Protagonista.getNireProtagonista().setBizitzaBerria(emaitza);
		}
		else{
			emaitza = Protagonista.getNireProtagonista().getPv() - atq;
			Protagonista.getNireProtagonista().setBizitzaBerria(emaitza);
		}
	}
	public boolean bizirik(){
		boolean bizirikDago = false;
		if(this.pv > 0){
			bizirikDago = true;
		}
		return bizirikDago;
	}

	
}
