package ro.ase.cts.simplefactory.seminar3.factory;

import ro.ase.cts.simplefactory.seminar3.vehicule.Autobuz;
import ro.ase.cts.simplefactory.seminar3.vehicule.MijlocTransport;
import ro.ase.cts.simplefactory.seminar3.vehicule.Tramvai;
import ro.ase.cts.simplefactory.seminar3.vehicule.Troleibuz;

public class MijlocTransportFactory {
    public static MijlocTransportFactory instance;
    public static MijlocTransportFactory getInstance(){
        if(instance == null){
            instance = new MijlocTransportFactory();
        }
        return instance;
    }
    private MijlocTransportFactory(){}
    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip) throws Exception {
        if(tip == MijlocTransportType.TRAMVAI){
            return new Tramvai(marca,linie);
        }
        if(tip == MijlocTransportType.TROLEIBUZ){
            return new Troleibuz(marca,linie);
        }
        if(tip == MijlocTransportType.AUTOBUZ){
            return new Autobuz(marca,linie);
        }
        throw new Exception("Tip invalid");
    }
}
