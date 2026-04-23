package ro.ase.cts.adapter.seminar6.clase.spital;

public class Medicament
{
    private String nume;
    private double pret;

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        if(prezintaReteta()==true)
        {
            System.out.println("Medicamentul: "+this.nume+ " este achizitionat la pretul de " + this.pret+".");
        }
        else
            System.out.println("Nu exista reteta pentru acest medicament!");
    }

    public boolean prezintaReteta(){
        if(nume.contains("reteta"))
            return true;
        else
            return false;
    }
}
