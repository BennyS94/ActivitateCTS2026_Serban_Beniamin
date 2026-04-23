package ro.ase.cts.fasade.seminar6.main;

import ro.ase.cts.fasade.seminar6.calse.Medic;
import ro.ase.cts.fasade.seminar6.calse.Pacient;
import ro.ase.cts.fasade.seminar6.calse.ReceptieSpital;
import ro.ase.cts.fasade.seminar6.calse.Salon;

//A.6. Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului prin
//intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
//disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si
//ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat ci
//să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.
public class Main {
    public static void main(String[] args) {
        Pacient pacient1 =new Pacient("Marius George", 7);
        Pacient pacient2 =new Pacient("Rahihk Huss", 3);

        Medic medic=new Medic();
        Salon salon= new Salon();

        ReceptieSpital receptieSpital=new ReceptieSpital(medic,salon);
        receptieSpital.internarePacient(pacient1);
        receptieSpital.internarePacient(pacient2);
    }
}
