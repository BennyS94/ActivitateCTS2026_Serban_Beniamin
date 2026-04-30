package ro.ase.cts.proxy.seminar8.clase;

public class AutobuzDeNoapte implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    public AutobuzDeNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void oprireInStatie() {
        if(mijlocTransport.getNrPasageri()>0){
            mijlocTransport.oprireInStatie();
        }
        else {
            System.out.println("Autobuzul isi va continua traseul fara oprire in statia curenta.");
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocTransport.getNrPasageri();
    }

    @Override
    public String getLinie() {
        return mijlocTransport.getLinie();
    }
}
