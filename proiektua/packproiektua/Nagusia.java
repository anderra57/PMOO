package packproiektua;

import java.util.*;

public class Nagusia {
    public static void main(String[] args) {
    	Protagonista p = Protagonista.getNireProtagonista("Sd");
    	Saloia saloia = Saloia.getNireSaloia();
    	saloia.eszenatokiaHasieratu();
    	saloia.eszenatokiaInprimatu();
    	p.hasierakoPosizioa();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	saloia.setPertsonaiaMatrizean(16,4);
    	saloia.eszenatokiaInprimatu();
    	Akzioa akzioa = new Akzioa("Lehengo akzioa da hau",2);
    	akzioa.akzioaInprimatu();
    	akzioa.mugitu();
    }
    
}
