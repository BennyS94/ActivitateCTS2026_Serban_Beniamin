package ro.ase.cts.cleancode.seminar1si2.clase.loadres;

import ro.ase.cts.cleancode.seminar1si2.clase.Angajat;
import ro.ase.cts.cleancode.seminar1si2.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiLoader extends AplicantiLoader {
    public List<Aplicant> load(String file) throws FileNotFoundException{
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat=new Angajat();
            super.loadAplicatData(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;

    };

}
