package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Nagusia {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
    	
    	//FitxeroakIrakurri.mapaIrakurri("C:/Users/ANDER/Desktop/20202.txt");
    	Protagonista p = Protagonista.hasieratuProtagonista("Toquero");
    	int preX;
    	int preY;
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	
    	
    	//Saloia
    	Saloia saloia = Saloia.getNireSaloia();
    	saloia.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(1);
    	ListaAkzioa listaAkzS=listaAkz.listaAkzioakSortu(1);
    	

    	/*
    	//saloia.eszenatokiaInprimatu();
    	while(!listaAkz.bukatutaSaloia()){
    	saloia.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzS.akzioaAukeratuEtaBurutu(1);
    	Teklatua.getNireTeklatua().emanEnter();
    	saloia.deletePertsonaiaMatrizetik(preX, preY);
    	saloia.setPertsonaiaMatrizean();
    	}
    	*/
    	saloia.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();
    	
    	
    	//TimeUnit.SECONDS.sleep(5);
    	//a.mugitu();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
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
