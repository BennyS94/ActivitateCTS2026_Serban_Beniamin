package ro.ase.cts.factorymeth.exercitiu1.program;

import ro.ase.cts.factorymeth.exercitiu1.clase.PersonalSpital;
import ro.ase.cts.factorymeth.exercitiu1.fabrica.FactoryPersonal;
import ro.ase.cts.factorymeth.exercitiu1.fabrica.FactoryPersonalMedical;
import ro.ase.cts.factorymeth.exercitiu1.fabrica.FactoryPersonalNonMedical;

import static ro.ase.cts.factorymeth.exercitiu1.enums.PersonalMedical.MEDIC;
import static ro.ase.cts.factorymeth.exercitiu1.enums.PersonalNonMedical.SECRETAR;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal fabricaPerosnalMedical= new FactoryPersonalMedical();
        PersonalSpital medic=fabricaPerosnalMedical.createInstance(MEDIC, "Marian Anghel","0888332", 7500.00);
        medic.afiseazaDetalii();

        FactoryPersonal factoryPersonalNonMedical=new FactoryPersonalNonMedical();
        PersonalSpital secretar=factoryPersonalNonMedical.createInstance(SECRETAR,"Ionel Marcu", "0888332", 5000.000);
        secretar.afiseazaDetalii();

    }
}
