package ro.ase.cts.factorymeth.seminar5.clase;

public class Papanasi extends Desert{
    public Papanasi(int gramaj, double pret, int kcal) {
        super(gramaj, pret, kcal);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb= new StringBuilder();
        sb.append("Papanasi, "+ super.toString());
        System.out.println(sb);
    }
}
