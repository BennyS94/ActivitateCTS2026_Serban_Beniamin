package ro.ase.cts.builder.exercitiu2.clase.clase;

public class Rezervare {
    double ora;
    int nrPersoane;
    boolean asezareGeam;
    boolean scauneErogonomice;
    boolean decorareMasa;
    boolean muzicaPersonalizata;
    int idGenMuzica;

    private Rezervare(RezervareBuilder builder){
        this.ora = builder.ora;
        this.nrPersoane = builder.nrPersoane;
        this.asezareGeam = builder.asezareGeam;
        this.scauneErogonomice = builder.scauneErogonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaPersonalizata = builder.muzicaPersonalizata;
        this.idGenMuzica = builder.idGenMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "ora=" + ora +
                ", nrPersoane=" + nrPersoane +
                ", asezareGeam=" + asezareGeam +
                ", scauneErogonomice=" + scauneErogonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaPersonalizata=" + muzicaPersonalizata +
                ", idGenMuzica=" + idGenMuzica +
                '}';
    }

    public static class RezervareBuilder{
        double ora;
        int nrPersoane;
        boolean asezareGeam;
        boolean scauneErogonomice;
        boolean decorareMasa;
        boolean muzicaPersonalizata;
        int idGenMuzica;

        public RezervareBuilder(double ora, int nrPersoane) {
            this.ora = ora;
            this.nrPersoane = nrPersoane;

            this.asezareGeam = false;
            this.scauneErogonomice = false;
            this.decorareMasa = false;
            this.muzicaPersonalizata = false;
            this.idGenMuzica = 0;
        }

        public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder setScauneErogonomice(boolean scauneErogonomice) {
            this.scauneErogonomice = scauneErogonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaPersonalizata(boolean muzicaPersonalizata) {
            this.muzicaPersonalizata = muzicaPersonalizata;
            return this;
        }

        public RezervareBuilder setIdGenMuzica(int idGenMuzica) {
            this.idGenMuzica = idGenMuzica;
            return this;
        }

        public Rezervare build(){
            return new Rezervare(this);
        }
    }
}
