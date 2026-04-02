package ro.ase.cts.subiecte_combinate.subiect5.clase;

public class Magazin {
    String denumire;
    int suprafata;//in m^2
    int nrIntrari;
    boolean arePodeaPersonalizata;

    private Magazin(MagazinBuilder builder) {
        this.denumire = builder.denumire;
        this.suprafata = builder.suprafata;
        this.nrIntrari = builder.nrIntrari;
        this.arePodeaPersonalizata = builder.arePodeaPersonalizata;
    }

    public static class MagazinBuilder implements iMagazinBuilder {
        String denumire;
        int suprafata;//in m^2
        int nrIntrari;
        boolean arePodeaPersonalizata;

        public MagazinBuilder(String denumire, int suprafata) {
            this.denumire = denumire;
            this.suprafata = suprafata;
            this.nrIntrari = 1;
            this.arePodeaPersonalizata = false;
        }

        public MagazinBuilder setNrIntrari(int nrIntrari) {
            this.nrIntrari = nrIntrari;
            return this;
        }

        public MagazinBuilder arePodeaPersonalizata(boolean arePodeaPersonalizata) {
            this.arePodeaPersonalizata = arePodeaPersonalizata;
            return this;
        }

        public Magazin build(){
            return new Magazin(this);
        }
    }
}
