package ro.ase.cts.factorymeth.seminar5.fabrici;

import ro.ase.cts.factorymeth.seminar5.clase.Clatite;
import ro.ase.cts.factorymeth.seminar5.clase.FelDeMancare;
import ro.ase.cts.factorymeth.seminar5.clase.Papanasi;
import ro.ase.cts.factorymeth.seminar5.enums.TipDesert;
import ro.ase.cts.factorymeth.seminar5.enums.TipFelDeMancare;

//Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită,
//etc. Si mai multe tipuri de desert: Papanasi, Clatite, CheeseCake, etc Să se implementeze modulul
//care permite realizarea de obiecte din familia Felurilor de mancare impartite pe categorii: Supe si
//Desert.

public class FabricaDeDesert implements FabricaDeFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return creareFelDeMancare(tip,gramaj,pret,100);
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int kcal) {
        return switch (tip) {
            case TipDesert.Papanasi -> new Papanasi(gramaj,pret,kcal);
            case TipDesert.Clatite -> new Clatite(gramaj,pret,kcal);
            default -> null;
        };
    }
}
