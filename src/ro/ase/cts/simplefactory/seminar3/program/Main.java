package ro.ase.cts.simplefactory.seminar3.program;

import ro.ase.cts.simplefactory.seminar3.factory.MijlocTransportFactory;
import ro.ase.cts.simplefactory.seminar3.factory.MijlocTransportType;
import ro.ase.cts.simplefactory.seminar3.vehicule.MijlocTransport;

import javax.sound.midi.MidiChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void afisareDescriere(MijlocTransport mijlocTransport)
    {
        System.out.println(mijlocTransport);
    }

    public static void main(String[] args) throws Exception {
        MijlocTransportFactory factory = MijlocTransportFactory.getInstance();
        MijlocTransport autobuz = factory.getMijlocTransport(
                "Mercedes",
                432,
                MijlocTransportType.AUTOBUZ
        );
        MijlocTransport tramvai = factory.getMijlocTransport(
                "Astra",
                101,
                MijlocTransportType.TRAMVAI
        );
        MijlocTransport troleibuz = factory.getMijlocTransport(
                "Otokar",
                44,
                MijlocTransportType.TROLEIBUZ
        );
        afisareDescriere(autobuz);
        afisareDescriere(tramvai);
        afisareDescriere(troleibuz);

    }
}