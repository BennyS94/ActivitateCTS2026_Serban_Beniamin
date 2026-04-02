package ro.ase.cts.singleton.exercitiu2_registry.clase;

import java.util.HashMap;
import java.util.Map;

public class Automat {
    private static final HashMap<String,Automat> instante= new HashMap<>();

    String codStatie;
    String numeStatie;

    int nrBileteEmise;
    double pretBilet;

    private Automat(String codStatie, String numeStatie) {
        this.codStatie = codStatie;
        this.numeStatie = numeStatie;
        this.nrBileteEmise = 0;
        this.pretBilet = 2.5;
    }

    @Override
    public String toString() {
        return "Automat{" +
                "codStatie='" + codStatie + '\'' +
                ", numeStatie='" + numeStatie + '\'' +
                ", nrBileteEmise=" + nrBileteEmise +
                ", pretBilet=" + pretBilet +
                '}';
    }

    public static synchronized Automat getInstance(String codStatie, String numeStatie){
        if(!instante.containsKey(codStatie))
        {
            instante.put(codStatie,new Automat(codStatie,numeStatie));
        }
        return instante.get(codStatie);
    }

    public void emiteBilete(int nrBilete){
        this.nrBileteEmise+=nrBilete;
        System.out.println("Emitere cu Succes!");
    }

    public void vizualizareNrBileteEmise(){
        System.out.println("Au fost emise "+nrBileteEmise+" bilete.");
    }

    public void modificarePretBilet(double pretNou){
        this.pretBilet= pretNou;
        System.out.printf("Pretul unui bilet este de "+pretBilet+" RON.");
    }
}

