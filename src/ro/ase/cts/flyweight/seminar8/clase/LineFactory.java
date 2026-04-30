package ro.ase.cts.flyweight.seminar8.clase;

import java.util.HashMap;
import java.util.Map;

public class LineFactory {
    public Map<Integer, LinieTraseu> logLinii=new HashMap<>();

    public LinieTraseu getLinieTraseu(int nrLinie, String primaStatie, String ultimaStaite){
        if(logLinii.containsKey(nrLinie)){
            return logLinii.get(nrLinie);
        }
        else {
            logLinii.put(nrLinie, new Linie(primaStatie,ultimaStaite,nrLinie));
            System.out.printf("Linia "+nrLinie+" a fost inregistrata.");
            return logLinii.get(nrLinie);
        }
    }
}
