package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Nagusia {
	
	private char[][] hasmatrix= new char[20][20];
	
	
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
/*
 * 
 * 		JOKOAREN BALIOAK HASIERATU
 *     	
 */
    	Protagonista p = Protagonista.getNireProtagonista(); 
    	int preX;
    	int preY;
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	
    	saloia.jokoaHasieratu();
    	  	
/*
 * 
 * 		SALOIA
 * 
 */		//SALOIKO BALIOAK HASIERATU
    	saloia.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(1);
    	ListaAkzioa listaAkzS=listaAkz.listaAkzioakSortu(1);
    	
    	//SALOIA EGOERA    
    	while(!listaAkz.bukatutaSaloia()){
    	saloia.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzS.akzioaAukeratuEtaBurutu(1);
    	Teklatua.getNireTeklatua().emanEnter();
    	saloia.deletePertsonaiaMatrizetik(preX, preY);
    	saloia.setPertsonaiaMatrizean();
    	}
    	
    	//EGOERAZ ALDATU
    	saloia.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();    	
/*
 * 
 * 		HILERRIA
 *     	
 */
    	
    	hilerria.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(2);
    	ListaAkzioa listaAkzH=listaAkz.listaAkzioakSortu(2);
    	
        
    	while(!listaAkz.bukatutaHilerria()){
    	hilerria.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzH.akzioaAukeratuEtaBurutu(1);
    	Teklatua.getNireTeklatua().emanEnter();
    	hilerria.deletePertsonaiaMatrizetik(preX, preY);
    	hilerria.setPertsonaiaMatrizean();
    	}
    	
    	hilerria.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();
    	

    	
    	
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
