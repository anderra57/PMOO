package packproiektua;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxeroakIrakurri {
	
	private static FitxeroakIrakurri nireFitxeroakIrakurri = null;
	
	public FitxeroakIrakurri(){
		
	}
	
	private static FitxeroakIrakurri getNireFitxeroakIrakurri(){
		if(nireFitxeroakIrakurri==null){
			nireFitxeroakIrakurri=new FitxeroakIrakurri();
		}
		return nireFitxeroakIrakurri;
	}
	
	public static void fitxeroaErakutsi(String pFitxeroa) throws FileNotFoundException, IOException{
		String katea;
		FileReader f=new FileReader(pFitxeroa);
		BufferedReader b=new BufferedReader(f);
		while((katea=b.readLine())!=null){
			System.out.println(katea);
		}
		b.close();
	}
	
	public static void mapaIrakurri(String pFitxeroa) throws FileNotFoundException, IOException{
		char[][] matrizea = new char[20][20];
		FileReader f=new FileReader(pFitxeroa);
		BufferedReader b=new BufferedReader(f);
				
		
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  char c = (char)b.read();
				  matrizea[i][j]=c;
						  
			  }
		}
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		
		
		b.close();
		//return matrizea;
	}
}
