package ro.ase.cts.proxy.seminar8.main;

//F.8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane
//in autobuz. In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se
//implementeze modul care va permite oprirea in statie a autobuzelor doar daca exista calatori in
//autobuz.

import ro.ase.cts.proxy.seminar8.clase.Autobuz;
import ro.ase.cts.proxy.seminar8.clase.AutobuzCursaSpeciala;
import ro.ase.cts.proxy.seminar8.clase.AutobuzDeNoapte;
import ro.ase.cts.proxy.seminar8.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz1 =new Autobuz("165 - Magheru",30);
        autobuz1.oprireInStatie();
        autobuz1.oprireInStatie();

        MijlocTransport autobuzNoapte1=new AutobuzDeNoapte(autobuz1);
        autobuzNoapte1.oprireInStatie();

        MijlocTransport autobuz2=new Autobuz("152 - Averescu", 0);
        autobuz2.oprireInStatie();
        autobuz2.oprireInStatie();
        autobuz2.oprireInStatie();

        MijlocTransport autobuzNoapte2=new AutobuzDeNoapte(autobuz2);
        autobuzNoapte2.oprireInStatie();

        MijlocTransport autobuz3=new Autobuz("Linie Speciala - MUZEU",12);
        MijlocTransport autobuzSpecial=new AutobuzCursaSpeciala(autobuz3);
        autobuzSpecial.oprireInStatie();
    }
}
