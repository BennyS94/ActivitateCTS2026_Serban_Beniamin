package ro.ase.cts.singleton.exercitiu2_registry.clase;

import java.util.HashMap;

public class AutomatBilete {
    private static final HashMap<String, AutomatBilete> instante= new HashMap<>();

    private String codStatie;
    private String numeStatie;
    private int numarBileteDisponibile;
    private int numarValidari;

    private AutomatBilete(String codStatie, String numeStatie) {
        this.codStatie = codStatie;
        this.numeStatie = numeStatie;
        this.numarBileteDisponibile = 0;
        this.numarValidari = 0;
    }

    public static synchronized AutomatBilete getInstance(String codStatie, String numeStatie) {
        if (!instante.containsKey(codStatie)) {
            instante.put(codStatie, new AutomatBilete(codStatie, numeStatie));
        }
        return instante.get(codStatie);
    }

    @Override
    public String toString() {
        return "AutomatBilete{" +
                "codStatie='" + codStatie + '\'' +
                ", numeStatie='" + numeStatie + '\'' +
                ", numarBileteDisponibile=" + numarBileteDisponibile +
                ", numarValidari=" + numarValidari +
                '}';
    }
}
