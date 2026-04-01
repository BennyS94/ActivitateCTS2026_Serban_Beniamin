package ro.ase.cts.factorymeth.seminar5.clase;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(int gramaj, Double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb= new StringBuilder();
        sb.append("Supa De Legume, "+ super.toString());
        System.out.println(sb);
    }
}
