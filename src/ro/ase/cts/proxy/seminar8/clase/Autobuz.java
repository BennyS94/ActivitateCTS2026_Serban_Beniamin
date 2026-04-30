package ro.ase.cts.proxy.seminar8.clase;

public class Autobuz implements MijlocTransport{
    private String linie;
    private int nrPasageri;

    public Autobuz(String linie, int nrPasageri) {
        this.linie = linie;
        this.nrPasageri = nrPasageri;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public String getLinie() {
        return linie;
    }

    @Override
    public void oprireInStatie() {
        System.out.println("Autobuzul "+this.linie+ " se opreste in statie.");
    }
}
