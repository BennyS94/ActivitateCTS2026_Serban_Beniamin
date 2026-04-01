package ro.ase.cts.prototype.seminar5.clase;

public class Rezervare implements PrototypeRezervare{
    private String numeClient;
    private int nrPersoane;
    private double ora;
    private String nrTelefon;

    public Rezervare(String numeClient, int nrPersoane, double ora, String nrTelefon) {
        if(numeClient.length()<3)
            this.numeClient="Anonim";
        else
            this.numeClient = numeClient;

        if(nrPersoane<0)
            this.nrPersoane=1;
        else
            this.nrPersoane = nrPersoane;


        if(ora< 9.0 && ora>24.0)
            this.ora=Math.abs(ora)+9.00;
        else
            this.ora = ora;

        if(nrTelefon.length()!=10)
            this.nrTelefon="?";
        else
            this.nrTelefon = nrTelefon;
    }

    private Rezervare() {
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(double ora) {
        this.ora = ora;
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rez=new Rezervare();
        rez.numeClient=this.numeClient;
        rez.nrPersoane=this.nrPersoane;
        rez.ora=this.ora;
        rez.nrTelefon=this.nrTelefon;

        return rez;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", ora=" + ora +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }
}
