package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Nagusia {
    public static void main(String[] args) throws FileNotFoundException, IOException{
    	Protagonista p = Protagonista.hasieratuProtagonista("Toquero");
    	int preX;
    	int preY;
    	//Saloia
    	Saloia saloia = Saloia.getNireSaloia();
    	Akzioa a = new Akzioa("Lehenengo akzioa da hau", 3);
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	saloia.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(1);
    	listaAkz.listaAkzioakSortu(saloia);
    	

    	
    	saloia.eszenatokiaInprimatu();
    	while(true){
    	preX=p.getX();
    	preY=p.getY();
    	a.mugitu();
    	saloia.setPertsonaiaMatrizean();
    	saloia.deletePertsonaiaMatrizetik(preX, preY);
    	saloia.eszenatokiaInprimatu();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Hilerria
    	/*Hilerria hilerria = Hilerria.getNireHilerria();
    	hilerria.eszenatokiaHasieratu();
    	hilerria.eszenatokiaInprimatu();
    	System.out.println(" ");
    	System.out.println(" ");
    	p.hasierakoPosizioa();
    	hilerria.eszenatokiaInprimatu();*/
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Banketxea
    	/*Banketxea banketxea = Banketxea.getNireBanketxea();
    	ListaEtsaiak listae = new ListaEtsaiak();
    	banketxea.eszenatokiaHasieratu();
    	banketxea.eszenatokiaInprimatu();
    	System.out.println(" ");
    	System.out.println(" ");
    	p.hasierakoPosizioa();
    	banketxea.eszenatokiaInprimatu();*/
    }
    
}
