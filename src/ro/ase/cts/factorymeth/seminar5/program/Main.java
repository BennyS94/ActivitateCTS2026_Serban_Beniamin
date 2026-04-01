package ro.ase.cts.factorymeth.seminar5.program;

import ro.ase.cts.factorymeth.seminar5.clase.FelDeMancare;
import ro.ase.cts.factorymeth.seminar5.enums.TipDesert;
import ro.ase.cts.factorymeth.seminar5.enums.TipSupa;
import ro.ase.cts.factorymeth.seminar5.fabrici.FabricaDeDesert;
import ro.ase.cts.factorymeth.seminar5.fabrici.FabricaDeFelDeMancare;
import ro.ase.cts.factorymeth.seminar5.fabrici.FabricaSupa;

public class Main {

    public static void main(String[] args) {
        FabricaDeFelDeMancare fabricaDeFelDeMancare=new FabricaSupa();
        FelDeMancare supaDeVita= fabricaDeFelDeMancare.creareFelDeMancare(TipSupa.SupaDeVita,200,35.0);
        FelDeMancare supaDeLegume= fabricaDeFelDeMancare.creareFelDeMancare(TipSupa.SupaDeLegume,200,30.0);

        fabricaDeFelDeMancare= new FabricaDeDesert();
        FelDeMancare clatite= fabricaDeFelDeMancare.creareFelDeMancare(TipDesert.Clatite,150,20.0);
        FelDeMancare papanasi= fabricaDeFelDeMancare.creareFelDeMancare(TipDesert.Papanasi,150,25.0);

    }

}
