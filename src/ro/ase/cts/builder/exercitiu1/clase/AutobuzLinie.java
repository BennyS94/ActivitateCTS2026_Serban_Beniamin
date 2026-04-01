package ro.ase.cts.builder.exercitiu1.clase;

public class AutobuzLinie {
    String modelAutobuz;
    int idSofer;
    boolean areOprireLaCapatDeLinie;
    boolean areDeschidereUsiLaCererePasajer;
    String textAfisat;

    private AutobuzLinie(AutobuzLinieBuilder builder) {
        this.modelAutobuz = builder.modelAutobuz;
        this.idSofer = builder.idSofer;
        this.areOprireLaCapatDeLinie = builder.areOprireLaCapatDeLinie;
        this.areDeschidereUsiLaCererePasajer = builder.areDeschidereUsiLaCererePasajer;
        this.textAfisat = builder.textAfisat;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", idSofer=" + idSofer +
                ", areOprireLaCapatDeLinie=" + areOprireLaCapatDeLinie +
                ", areDeschidereUsiLaCererePasajer=" + areDeschidereUsiLaCererePasajer +
                ", textAfisat='" + textAfisat + '\'' +
                '}';
    }

    public static class AutobuzLinieBuilder{
        String modelAutobuz;
        int idSofer;
        boolean areOprireLaCapatDeLinie;
        boolean areDeschidereUsiLaCererePasajer;
        String textAfisat;

        public AutobuzLinieBuilder(String modelAutobuz, int idSofer) {
            this.modelAutobuz = modelAutobuz;
            this.idSofer = idSofer;

            this.areOprireLaCapatDeLinie = false;
            this.areDeschidereUsiLaCererePasajer = false;
            this.textAfisat = "Linie Speciala";
        }

        public AutobuzLinieBuilder setAreOprireLaCapatDeLinie(boolean areOprireLaCapatDeLinie) {
            this.areOprireLaCapatDeLinie = areOprireLaCapatDeLinie;
            return this;
        }

        public AutobuzLinieBuilder setAreDeschidereUsiLaCererePasajer(boolean areDeschidereUsiLaCererePasajer) {
            this.areDeschidereUsiLaCererePasajer = areDeschidereUsiLaCererePasajer;
            return this;
        }

        public AutobuzLinieBuilder setTextAfisat(String textAfisat) {
            this.textAfisat = textAfisat;
            return this;
        }

        public AutobuzLinie build(){
            return new AutobuzLinie(this);
        }
    }
}
