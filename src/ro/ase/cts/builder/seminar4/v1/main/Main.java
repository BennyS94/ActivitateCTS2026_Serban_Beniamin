package ro.ase.cts.builder.seminar4.v1.main;

import ro.ase.cts.builder.seminar4.v1.builder01.AbstractBuilder;
import ro.ase.cts.builder.seminar4.v1.builder01.Internare;
import ro.ase.cts.builder.seminar4.v1.builder01.InternareBuilder;
import ro.ase.cts.builder.seminar4.v1.builder02.AbstractBuilder02;
import ro.ase.cts.builder.seminar4.v1.builder02.Internare02;
import ro.ase.cts.builder.seminar4.v1.builder02.InternareBuilder02;

//A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
//pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
//dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
//facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
//de obiecte de tipul pacient cu opțiuni extra.

public class Main {

    public static void main(String[] args) {

        Internare i1=new Internare();
        i1.setNumePacient("Marin");
        i1.setPatRabatabil(true);

        Internare i2=new Internare("Andreius",false,true,true,true);

        System.out.println(i1.toString());
        System.out.println(i2.toString());

        AbstractBuilder builder01 =new InternareBuilder("Gerogica");
        Internare i3= builder01.hasPatRabatabil(true).build();
        Internare i4= builder01.hasPapuciDeCamera(true).setNume("Gigel").build();

        System.out.println(i3.toString());
        System.out.println(i4.toString());

        AbstractBuilder02 builder02=new InternareBuilder02();
        builder02.hasMicDejunInclus(true);
        Internare02 i5=builder02.build("Geani");
        Internare02 i6=builder02.hasHalat(true).build("Ion");

        System.out.println(i5.toString());
        System.out.println(i6.toString());

    }

}
