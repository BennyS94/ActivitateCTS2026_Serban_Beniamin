package ro.ase.cts.factorymeth.exercitiu1.fabrica;

import ro.ase.cts.factorymeth.exercitiu1.clase.PersonalSpital;
import ro.ase.cts.factorymeth.exercitiu1.enums.TipPersonal;

public interface FactoryPersonal {
    PersonalSpital createInstance(TipPersonal tipPersonal, String nume, String CNP, double salariu);
}
