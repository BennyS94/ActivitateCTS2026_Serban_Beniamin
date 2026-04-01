package ro.ase.cts.prototype.seminar5.program;


// Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client
//a mai fost la restaurant și revine pentru a realiza o rezervare să nu fie necesară reconstruirea unui
//cont respectivului client, deoarece construirea unui nou obiect durează foarte mult si solicita mai
//multe date.

import ro.ase.cts.prototype.seminar5.clase.PrototypeRezervare;
import ro.ase.cts.prototype.seminar5.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        PrototypeRezervare r1=new Rezervare("Ion",3,14.0,"0733323333");
        PrototypeRezervare r2= r1.copiaza();

        ((Rezervare)r2).setNrPersoane(2);
        ((Rezervare)r2).setOra(13.30);

        System.out.println(r1.toString());
        System.out.println(r2.toString());

    };
}
