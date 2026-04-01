package ro.ase.cts.factorymeth.seminar5.fabrici;

import ro.ase.cts.factorymeth.seminar5.clase.FelDeMancare;
import ro.ase.cts.factorymeth.seminar5.clase.SupaDeLegume;
import ro.ase.cts.factorymeth.seminar5.enums.TipFelDeMancare;
import ro.ase.cts.factorymeth.seminar5.enums.TipSupa;

public class FabricaSupa implements FabricaDeFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch(tip){
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj,pret);
            case TipSupa.SupaDeVita -> new SupaDeLegume(gramaj,pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int kcal) {
        return creareFelDeMancare(tip, gramaj, pret);
    }
}
