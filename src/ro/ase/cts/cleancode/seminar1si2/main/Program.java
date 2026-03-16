package ro.ase.cts.cleancode.seminar1si2.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.cleancode.seminar1si2.clase.Aplicant;
import ro.ase.cts.cleancode.seminar1si2.clase.loadres.AngajatiLoader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = new AngajatiLoader().load("angajati.txt");

			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
