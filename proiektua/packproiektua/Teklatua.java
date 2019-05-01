package packproiektua;

import java.util.Scanner;
//import java.io.FileReader;
//import java.io.BufferedReader;

public class Teklatua {
	
	private Scanner sc;
	private static Teklatua nireTeklatua = null;
	
	private Teklatua(){
		this.sc = new Scanner(System.in);
	}
	
	public static Teklatua getNireTeklatua(){
		if(nireTeklatua == null){
			nireTeklatua = new Teklatua();
		}
		return nireTeklatua;
	}
	
	public int irakurriZenb() throws NumberFormatException {
		String sar = this.sc.nextLine();
		int zenb = Integer.parseInt(sar);
		return zenb;
	}
	
	public char irakurriChar(){
		char c=sc.next().charAt(0);
		return c;
	}
}
