package ro.ase.cts.subiecte_combinate.subiect5.program;

import ro.ase.cts.subiecte_combinate.subiect5.clase.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin=new Magazin.MagazinBuilder("Zara", 200).arePodeaPersonalizata(true).build();
    }
}
