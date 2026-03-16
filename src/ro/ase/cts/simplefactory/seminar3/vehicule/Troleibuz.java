package ro.ase.cts.simplefactory.seminar3.vehicule;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuz: ");
        sb.append(super.toString());
        System.out.println(sb);
    }
}
