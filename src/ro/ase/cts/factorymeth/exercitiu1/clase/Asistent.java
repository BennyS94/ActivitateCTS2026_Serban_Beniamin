package ro.ase.cts.factorymeth.exercitiu1.clase;

public class Asistent implements PersonalSpital{
    String nume;
    String CNP;

    public Asistent(String nume, String CNP) {
        this.nume = nume;
        this.CNP = CNP;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este asistent. ");
    }

}
