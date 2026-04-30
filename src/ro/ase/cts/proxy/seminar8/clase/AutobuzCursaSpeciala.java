package ro.ase.cts.proxy.seminar8.clase;

import java.sql.SQLOutput;

public class AutobuzCursaSpeciala implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void oprireInStatie() {
        if(this.mijlocTransport.getLinie().toLowerCase().contains("speciala")){;
            System.out.println("Traseu Special");
        }
        else {
            System.out.println("Autobuzul "+this.mijlocTransport.getLinie()+ " se opreste in statie.");
        }

    }

    @Override
    public int getNrPasageri() {
        return this.mijlocTransport.getNrPasageri();
    }

    @Override
    public String getLinie() {
        return this.mijlocTransport.getLinie();
    }
}
