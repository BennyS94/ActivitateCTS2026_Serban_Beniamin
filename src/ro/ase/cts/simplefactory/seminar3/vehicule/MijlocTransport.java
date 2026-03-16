package ro.ase.cts.simplefactory.seminar3.vehicule;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca, int linia) {
        this.marca = marca;
        this.linia = linia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Marca=").append(marca);
        sb.append(", linia=").append(linia);
        return sb.toString();
    }

    public abstract void afisareDescriere();
}
