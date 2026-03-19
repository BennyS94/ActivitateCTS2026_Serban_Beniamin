package ro.ase.cts.builder.seminar4.v1.builder01;

public class InternareBuilder implements AbstractBuilder{

    private Internare internare;

    public InternareBuilder(String numePacient){
        internare=new Internare();
        internare.setNumePacient(numePacient);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder hasPatRabatabil(boolean arePatRabatabil) {
        this.internare.setPatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder hasMicDejunInclus(boolean areMicDejunInclus) {
        this.internare.setMicDejunInclus(areMicDejunInclus);
        return this;
    }

    @Override
    public AbstractBuilder hasPapuciDeCamera(boolean arePapuciDeCamera) {
        this.internare.setPapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    @Override
    public AbstractBuilder hasHalat(boolean areHalat) {
        this.internare.setHalat(areHalat);
        return this;
    }
}
