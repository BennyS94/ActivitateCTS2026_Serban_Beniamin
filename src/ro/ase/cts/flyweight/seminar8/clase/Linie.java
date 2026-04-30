package ro.ase.cts.flyweight.seminar8.clase;

public class Linie implements LinieTraseu{
    private String primaStatie;
    private String ultimamaStatie;
    private int nrLinie;

    protected Linie(String primaStatie, String ultimamaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimamaStatie = ultimamaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "primaStatie='" + primaStatie + '\'' +
                ", ultimamaStatie='" + ultimamaStatie + '\'' +
                ", nrLinie=" + nrLinie +
                '}';
    }

    @Override
    public void afiseazaAutobuzLinie(Autobuz autobuz) {
        System.out.println(autobuz + this.toString());
    }

    @Override
    public void afiseazaNrMaximCalatoriPeTraseu(Autobuz autobuz) {
        System.out.println("Pe traseul "+ this.nrLinie+" pot merge concomitent maxim "+autobuz.getNrLocuri()+" de calatori.");
    }
}
