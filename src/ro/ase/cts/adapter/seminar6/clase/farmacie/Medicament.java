package ro.ase.cts.adapter.seminar6.clase.farmacie;

public class Medicament {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul "+ this.nume+ " este achizitionat la pretul "+ this.pret+".");
    }
}
