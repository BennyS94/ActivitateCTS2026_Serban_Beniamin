package ro.ase.cts.prototype.seminar3.vehicule;

public class Autobuz extends MijlocTransport {


    public Autobuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Autobuzul: ");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
