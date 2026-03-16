package ro.ase.cts.cleancode.seminar1si2.clase.loadres;

import ro.ase.cts.cleancode.seminar1si2.clase.Aplicant;
import ro.ase.cts.cleancode.seminar1si2.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviLoader extends AplicantiLoader{
    public List<Aplicant> load(String file) throws FileNotFoundException{
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev=new Elev();
            super.loadAplicatData(input2,elev);

            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }

}

