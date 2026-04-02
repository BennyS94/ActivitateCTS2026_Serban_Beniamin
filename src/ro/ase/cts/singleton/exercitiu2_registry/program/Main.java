package ro.ase.cts.singleton.exercitiu2_registry.program;

//Compania de transport în comun STB dorește implementarea unui modul software pentru gestionarea automatelor de
// bilete existente în toate stațiile importante din oraș. Fiecare automat este identificat printr-un cod unic de
// stație și trebuie să existe o singură instanță în aplicație pentru fiecare cod de stație, astfel încât
// informațiile despre acel automat să nu fie duplicate în memorie.

import ro.ase.cts.singleton.exercitiu2_registry.clase.AutomatBilete;

public class Main {
    public static void main(String[] args) {
        AutomatBilete automat1= AutomatBilete.getInstance("A001","Magherului A1");
        AutomatBilete automat2= AutomatBilete.getInstance("A001","SS A2");
        AutomatBilete automat3= AutomatBilete.getInstance("A003","Magherului A3");

        System.out.println(automat1);
        System.out.println(automat2);
        System.out.println(automat3);

    }
}
