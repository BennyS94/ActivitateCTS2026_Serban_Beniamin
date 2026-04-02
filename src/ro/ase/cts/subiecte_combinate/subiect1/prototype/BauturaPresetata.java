package ro.ase.cts.subiecte_combinate.subiect1.prototype;

public class BauturaPresetata implements PrototypeBautura{
    String nume;
    double aroma;
    boolean extraLapte;
    double pret;

    public BauturaPresetata(String nume, double aroma, boolean extraLapte, double pret) {
        this.nume = nume;
        this.aroma = aroma;
        this.extraLapte = extraLapte;
        this.pret = pret;
    }

    private BauturaPresetata() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAroma(double aroma) {
        this.aroma = aroma;
    }

    public void setExtraLapte(boolean extraLapte) {
        this.extraLapte = extraLapte;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public PrototypeBautura colne() {
        BauturaPresetata bauturaNoua= new BauturaPresetata();
        bauturaNoua.nume= bauturaNoua.nume;
        bauturaNoua.aroma=bauturaNoua.aroma;
        bauturaNoua.pret=bauturaNoua.pret;

        return bauturaNoua;
    }
}
