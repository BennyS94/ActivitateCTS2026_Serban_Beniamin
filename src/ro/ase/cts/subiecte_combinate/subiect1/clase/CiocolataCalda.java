package ro.ase.cts.subiecte_combinate.subiect1.clase;

public class CiocolataCalda implements Bautura{
    String nume;
    double volum;
    double pret;

    public CiocolataCalda(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void afiseazaPasiiPentruPreparare() {
        System.out.println("Pasii de prepare sunt: bla bla");

    }
}
