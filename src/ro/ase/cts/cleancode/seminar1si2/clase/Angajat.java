package ro.ase.cts.cleancode.seminar1si2.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private static int sumaFinantare = 10;

    public static void setSumaFinantare(int sumaFinantare) {
        Angajat.sumaFinantare = sumaFinantare;
    }

    private String ocupatie;
    private int salariu;

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();

    }


    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", NrProiecte=" + nrProiecte + ", DenumireProiect="
                + Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }


    public void afisareFinantare() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + Angajat.sumaFinantare + " Euro/zi in proiect.");
    }

}
