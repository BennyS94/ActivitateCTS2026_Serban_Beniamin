package ro.ase.cts.singleton.seminar3.main;

import ro.ase.cts.singleton.seminar3.clase.Hotel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Hotel1",2,4);
        Hotel hotel2 = Hotel.getInstance("Hotel2",4,4);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();


    }
}
