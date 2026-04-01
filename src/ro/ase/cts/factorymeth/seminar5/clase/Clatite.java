package ro.ase.cts.factorymeth.seminar5.clase;

public class Clatite extends Desert{
    public Clatite(int gramaj, double pret, int kcal) {
        super(gramaj, pret, kcal);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb= new StringBuilder();
        sb.append("Clatite, "+ super.toString());
        System.out.println(sb);
    }
}
