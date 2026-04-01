package ro.ase.cts.factorymeth.exercitiu1.fabrica;

import ro.ase.cts.factorymeth.exercitiu1.clase.Asistent;
import ro.ase.cts.factorymeth.exercitiu1.clase.Brancardier;
import ro.ase.cts.factorymeth.exercitiu1.clase.Medic;
import ro.ase.cts.factorymeth.exercitiu1.clase.PersonalSpital;
import ro.ase.cts.factorymeth.exercitiu1.enums.TipPersonal;

import static ro.ase.cts.factorymeth.exercitiu1.enums.PersonalMedical.*;

public class FactoryPersonalMedical implements FactoryPersonal {
    @Override
    public PersonalSpital createInstance(TipPersonal tipPersonal, String nume, String CNP, double salariu) {
        switch (tipPersonal){
            case MEDIC: return new Medic(nume,CNP,salariu);
            case ASISTENT: return new Asistent(nume,CNP);
            case BRANCARDIER: return new Brancardier(nume,CNP);
            default: return null;
        }
    }
}
