package ro.ase.cts.subiecte_combinate.subiect1.factory;

import ro.ase.cts.subiecte_combinate.subiect1.clase.Bautura;
import ro.ase.cts.subiecte_combinate.subiect1.clase.Cafea;
import ro.ase.cts.subiecte_combinate.subiect1.clase.Ceai;
import ro.ase.cts.subiecte_combinate.subiect1.clase.CiocolataCalda;
import ro.ase.cts.subiecte_combinate.subiect1.enums.Bauturi;

import static ro.ase.cts.subiecte_combinate.subiect1.enums.Bauturi.CAFEA;

public class FabricaBauturi {
    public Bautura creareBautura(Bauturi tipBautura, String nume,double volum, double pret){
        switch (tipBautura){
            case CAFEA: return new Cafea(nume,volum,pret);
            case CEAI: return new Ceai(nume,volum,pret);
            case CIOCOLATACALDA: return new CiocolataCalda(nume,volum,pret);
            default: return null;
        }
    }
}
