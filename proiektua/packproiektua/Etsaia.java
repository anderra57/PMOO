package packproiektua;

public class Etsaia {
	
	private int pv;
	private static int atq=5;
	private Banketxea banketxea1;

	public Etsaia(){
		this.pv = 100;
	}
	
	public void eraso(){
		int emaitza = Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).getPv();
		//En este metodo, lo qeu haria seria, si nuestro personaje esta cubierto, el etsaia nos va a quitar 0 de vida.
		//Si nuestro personaje no esta cubierto, que nos quite (5 o 10) de vida
		if(Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).estalita()){
			emaitza = Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).getPv();
			Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).setBizitzaBerria(emaitza);
		}
		else{
			emaitza = Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).getPv() - atq;
			Protagonista.getNireProtagonista("Sd", ListaAkzioa.getNireListaAkzioa(), Inbentarioa.getNireInbentarioa()).setBizitzaBerria(emaitza);
		}
	}
	public boolean bizirik(){
		boolean bizirikDago = false;
		if(this.pv > 0){
			bizirikDago = true;
		}
		return bizirikDago;
	}
	public void setMatrizean(int rx, int ry){
		banketxea1.setEtsaiakMatrizean(rx,ry);
	}
	
}
