package ro.ase.cts.factorymeth.exercitiu1.clase;

public class Registrator implements PersonalSpital{
    String nume;
    String CNP;

    public Registrator(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este registrator. ");
    }
}
