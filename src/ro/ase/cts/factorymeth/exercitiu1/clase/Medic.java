package ro.ase.cts.factorymeth.exercitiu1.clase;

import java.sql.SQLOutput;

public class Medic implements PersonalSpital{
    String nume;
    String CNP;
    double salariu;

    public Medic(String nume, String CNP, double salariu) {
        this.nume = nume;
        this.CNP = CNP;
        this.salariu = salariu;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this.nume+" este medic. ");
    }
}
