package ro.ase.cts.builder.exercitiu2.clase.program;

import ro.ase.cts.builder.exercitiu2.clase.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1= new Rezervare.RezervareBuilder(15.30,4).setAsezareGeam(true).build();

        System.out.println(rez1);
    }
}
