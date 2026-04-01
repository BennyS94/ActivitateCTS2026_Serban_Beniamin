package ro.ase.cts.factorymeth.seminar5.clase;

public class SupaDeVita extends Supa{
    public SupaDeVita(int gramaj, Double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb= new StringBuilder();
        sb.append("Supa De Vita, "+ super.toString());
        System.out.println(sb);
    }
}
