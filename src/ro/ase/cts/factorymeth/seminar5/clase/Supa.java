package ro.ase.cts.factorymeth.seminar5.clase;

public abstract class Supa implements FelDeMancare {
     int gramaj;
     double pret;

    public Supa(int gramaj, double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "gramaj=" + gramaj + ", pret=" + pret + '}';
    }
}
