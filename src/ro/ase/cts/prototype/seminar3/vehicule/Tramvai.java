package ro.ase.cts.prototype.seminar3.vehicule;

public class Tramvai extends MijlocTransport {
    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Tramvai: ");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
