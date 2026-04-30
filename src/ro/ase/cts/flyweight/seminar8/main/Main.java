package ro.ase.cts.flyweight.seminar8.main;

import ro.ase.cts.flyweight.seminar8.clase.Autobuz;
import ro.ase.cts.flyweight.seminar8.clase.LineFactory;

//F.9. Pentru fiecare AutobuzLinie sunt salvate in memorie, informatii precum: model autobuz, an
//fabricatie, numar locuri, numar linie,prima statie, ultima statie. Aceste informatii sunt salvate
//pentru fiecare AutobuzLinie din oras. Se doreste implementarea unui modul care sa asigure
//gestiunea in mod optim a memoriei, tinandu-se cont de faptul ca anumite informatii sunt
//redundante, deoarece pe o linie vor merge mai multe autobuze.
public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Mercedes AvizT",2015,48);
        Autobuz autobuz2=new Autobuz("Mercedes AvizT",2015,48);
        Autobuz autobuz3=new Autobuz("Mercedes AvizT",2015,48);

        LineFactory lineFactory=new LineFactory();
        lineFactory.getLinieTraseu(101,"Magheru","Averescu").afiseazaAutobuzLinie(autobuz1);
        lineFactory.getLinieTraseu(102,"Magheru","Bragardiru").afiseazaAutobuzLinie(autobuz2);
        lineFactory.getLinieTraseu(103,"Magheru","Giulesti").afiseazaAutobuzLinie(autobuz3);


    }
}
