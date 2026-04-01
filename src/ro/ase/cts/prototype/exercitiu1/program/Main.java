package ro.ase.cts.prototype.exercitiu1.program;

//F.2. Pentru crearea de obiecte de tip Autobuz sunt consumate foarte multe resurse. Din acest motiv
//trebuie propusa o varianta prin care daca exista deja un obiect creat, sa fie folosit acest obiect
//pentru viitoarele obiecte, fara a mai fi nevoie de crearea de la 0 a obiectelor de tip Autobuz. Aceeasi
//regula se va aplica si pentru alte tipuri de mijloace de transport.

import ro.ase.cts.prototype.exercitiu1.clase.Autobuz;
import ro.ase.cts.prototype.exercitiu1.clase.PrototypeAutobuz;

public class Main {
    public static void main(String[] args) {
        PrototypeAutobuz autobuz=new Autobuz("Opel Buz",41,4.3,1001);
        PrototypeAutobuz autobuzClona=autobuz.clone();

        System.out.println(autobuz);
        System.out.println(autobuzClona);

        ((Autobuz)autobuzClona).setNrLocuri(51);

        System.out.println(autobuz);
        System.out.println(autobuzClona);
    }
}
