package packproiektua;

public class Etsaia {
	
	private int bizitza;
	private int atq;
	
	public Etsaia(int pAtq){
		this.atq = pAtq;
		this.bizitza = 100;
	}
	
	public void eraso(int pAtq){
		int emaitza = 0;
		//En este metodo, lo qeu haria seria, si nuestro personaje esta cubierto, el etsaia nos va a quitar 0 de vida.
		//Si nuestro personaje no esta cubierto, que nos quite (5 o 10) de vida
		if(Protagonista.nireProtagonista().estalita()){
			Protagonista.nireProtagonista().setBizitzaBerria(emaitza);
		}
		else{
			emaitza = Protagonista.nireProtagonista().getPv() - 10;
			Protagonista.nireProtagonista().setBizitzaBerria(emaitza);
		}
	}
	public boolean bizirik(){
		boolean bizirikDago = false;
		if(this.bizitza <= 0){
			bizirikDago = true;
		}
		return bizirikDago;
	}
}
