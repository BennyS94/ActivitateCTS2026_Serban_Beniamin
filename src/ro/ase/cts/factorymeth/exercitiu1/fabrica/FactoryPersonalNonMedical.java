package ro.ase.cts.factorymeth.exercitiu1.fabrica;

import ro.ase.cts.factorymeth.exercitiu1.clase.PersonalSpital;
import ro.ase.cts.factorymeth.exercitiu1.clase.Registrator;
import ro.ase.cts.factorymeth.exercitiu1.clase.Secretar;
import ro.ase.cts.factorymeth.exercitiu1.enums.TipPersonal;

import static ro.ase.cts.factorymeth.exercitiu1.enums.PersonalNonMedical.REGISTRATOR;
import static ro.ase.cts.factorymeth.exercitiu1.enums.PersonalNonMedical.SECRETAR;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    @Override
    public PersonalSpital createInstance(TipPersonal tipPersonal, String nume, String CNP, double salariu) {
        switch(tipPersonal) {
            case SECRETAR: return new Secretar(nume, CNP);
            case REGISTRATOR: return new Registrator(nume, CNP);
            default: return null;
        }
    }
}
