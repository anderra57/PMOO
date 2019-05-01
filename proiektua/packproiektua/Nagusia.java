package packproiektua;

import java.util.*;

public class Nagusia {
    public static void main(String[] args) {
    	Protagonista p = Protagonista.getNireProtagonista("SD");
    	Saloia saloia = Saloia.getNireSaloia();
    	saloia.eszenatokiaInprimatu();
    	p.hasierakoPosizioa();
    }
}
