package ro.ase.cts.cleancode.seminar1si2.clase.loadres;

import ro.ase.cts.cleancode.seminar1si2.clase.Aplicant;
import ro.ase.cts.cleancode.seminar1si2.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiLoader extends AplicantiLoader {
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
           Student student=new Student();
           super.loadAplicatData(input,student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
