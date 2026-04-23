package ro.ase.cts.adapter.seminar6.main;

//A.5. Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea d
//medicamente pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și dorește să
//integreze sistemul informatic al farmaciei cu sistemul software existent în micul magazin de
//medicamente. Dezvoltatorii farmaciei trebuie să integreze aceste două aplicații, astfel încât
//aplicația farmaciei să poate folosi obiectele de tip Medicament din aplicația spitalului. Clasa
//Medicament din aplicația spitalului are metodele achizitioneazaMedicament() și prezintaReteta().
//Metoda prezintaReteta() este apelată din achizitioneazaMedicament() pentru verificarea rețetei.
//Clasa Medicament din aplicația farmaciei are o singură metodă cumpărăMedicament() în care nu
//se face verificarea rețetei, deoarece farmacia o să vândă medicamente și fără rețetă.

import ro.ase.cts.adapter.seminar6.clase.spital.Medicament;
import ro.ase.cts.adapter.seminar6.clase.spital.MedicamentAdapter;

public class Main {

    private static void procuraMedicament(ro.ase.cts.adapter.seminar6.clase.farmacie.Medicament medicament){
      medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Nurofen", 10);
        ro.ase.cts.adapter.seminar6.clase.farmacie.Medicament medicamentFarmacie =
                new ro.ase.cts.adapter.seminar6.clase.farmacie.Medicament("Nurofen", 10);

        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();
        medicamentSpital.prezintaReteta();
        //procuraMedicament(medicamentSpital);
        MedicamentAdapter medicamentAdaptat=new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdaptat);

    }
}
