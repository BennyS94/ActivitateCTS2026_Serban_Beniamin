package ro.ase.cts.factorymeth.seminar5.clase;

public abstract class Desert implements FelDeMancare{
    int gramaj;
    double pret;
    int kcal;

    public Desert(int gramaj, double pret, int kcal) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return
                "gramaj=" + gramaj +
                ", pret=" + pret +
                ", kcal=" + kcal +
                '}';
    }
}
