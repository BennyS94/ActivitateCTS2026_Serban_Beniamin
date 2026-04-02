package ro.ase.cts.subiecte_combinate.subiect1.program;

import ro.ase.cts.subiecte_combinate.subiect1.clase.Bautura;
import ro.ase.cts.subiecte_combinate.subiect1.clase.Cafea;
import ro.ase.cts.subiecte_combinate.subiect1.enums.Bauturi;
import ro.ase.cts.subiecte_combinate.subiect1.factory.FabricaBauturi;

//Bilet 2 - Cafenea
//
//Cerințe obligatorii
//
//1. Pattern-urile implementate trebuie să respecte definiția din GoF discutată în cadrul cursurilor și
// laboratoarelor. Nu sunt acceptate variații sau implementări incomplete.
//2. Pattern-ul trebuie implementat corect în totalitate pentru a fi luat în calcul.
//3. Soluția nu conține erori de compilare.
//4. Pattern-urile pot fi tratate distinct sau pot fi implementate pe același set de clase.
//5. Implementările care nu au legătură funcțională cu cerințele din subiect NU vor fi luate în calcul
// (preluarea unui exemplu din alte surse nu va fi punctată).
//6. NU este permisă modificarea claselor/interfețelor primite.
//7. Soluțiile vor fi verificate încrucișat folosind MOSS. Nu este permisă partajarea de cod între studenți.
// Soluțiile care au un grad de similitudine mai mare de 30% vor fi anulate.
//
//Cerințe Clean Code obligatorii (soluția este depunctată cu câte 2 puncte pentru fiecare cerință ce nu
// este respectată) - maxim se pot pierde 4 puncte
//
//1. Pentru denumirea claselor, funcțiilor, testelor unitare, atributelor și a variabilelor se respectă convenția
// de nume de tip Java Mix CamelCase.
//2. Pattern-urile și clasa ce conține metoda main() sunt definite în pachete distincte ce au forma
// cts.nume.prenume.gGrupa.pattern.model, cts.nume.prenume.Grupa.pattern.main (studenții din anul suplimentar
// trec „as” în loc de gGrupa).
//3. Clasele și metodele sunt implementate respectând principiile KISS, DRY și SOLID (atenție la DIP).
//4. Denumirile de clase, metode, variabile, precum și mesajele afișate la consolă trebuie să aibă legătură cu
// subiectul primit (nu sunt acceptate denumiri generice). Funcțional, metodele vor afișa mesaje la consolă care să simuleze acțiunea cerută sau vor implementa prelucrări simple.
//
//Se dezvoltă o aplicație software destinată unei cafenele.
//
//4p. Se dorește dezvoltarea unei aplicații pentru o cafenea digitală care să permită gestionarea comenzilor online.
// Sistemul trebuie să ofere o evidență clară a comenzilor plasate. Sistemul trebuie să permită crearea
// diferitelor tipuri de băuturi: Cafea, Ceai, Ciocolată caldă. Acestea vor implementa interfața Bautura.
//
//Fiecare tip de băutură va avea:
//- un nume
//- un volum (în mililitri)
//- un preț
//- o metodă de preparare specifică băuturii, în care sunt afișați pașii parcurși pentru preparare
//
//Crearea băuturilor trebuie separată de logica principală a aplicației.
//
//1p. Să se testeze soluția prin crearea a cel puțin patru obiecte de tipul Bautura și utilizarea acestora.
//
//3p. Sistemul va avea o componentă inteligentă de păstrare a tipurilor de băuturi personalizate pentru
// clienții fideli. Această componentă permite salvarea unor comenzi de băuturi ca șabloane
// (BauturaPresetata) și refolosirea lor prin copiere, pentru clienți fideli sau comenzi frecvente,
// astfel încât să nu se mai piardă timpul cu crearea băuturilor personalizate cum o dorește clientul.
// De exemplu, un client bea în fiecare dimineață un Latte de 350 de mililitri cu caramel.
//
//1p. Simulați plasarea a cel puțin patru comenzi prin care să arătați că două dintre ele au fost copiate.
public class Main {
    public static void main(String[] args) {
        FabricaBauturi fabricaBauturi=new FabricaBauturi();
        Bautura americano=fabricaBauturi.creareBautura(Bauturi.CAFEA,"Americano",100,15.8);
        Bautura ceaiVerde=fabricaBauturi.creareBautura(Bauturi.CEAI,"Ceai Verde",250,20.5);

        System.out.printf(americano.toString());
        americano.afiseazaPasiiPentruPreparare();

        System.out.printf(ceaiVerde.toString());
        ceaiVerde.afiseazaPasiiPentruPreparare();
    }
}
