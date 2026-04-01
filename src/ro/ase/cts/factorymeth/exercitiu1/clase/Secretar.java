package ro.ase.cts.factorymeth.exercitiu1.clase;

public class Secretar implements PersonalSpital{
    String nume;
    String CNP;

    public Secretar(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este secretar. ");
    }
}
