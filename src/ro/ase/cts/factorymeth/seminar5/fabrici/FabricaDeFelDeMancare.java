package ro.ase.cts.factorymeth.seminar5.fabrici;

import ro.ase.cts.factorymeth.seminar5.clase.FelDeMancare;
import ro.ase.cts.factorymeth.seminar5.enums.TipFelDeMancare;

public interface FabricaDeFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int kcal);
}
