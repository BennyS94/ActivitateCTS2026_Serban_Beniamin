package ro.ase.cts.builder.seminar4.v1.builder02;

public class InternareBuilder02 implements AbstractBuilder02 {

    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalat;

    public InternareBuilder02() {
        hasPatRabatabil=false;
        hasHalat=false;
        hasMicDejunInclus=false;
        hasPapuciDeCamera=false;
    }

    @Override
    public Internare02 build(String numePacient) {
        return new Internare02(numePacient,hasPatRabatabil,hasMicDejunInclus,hasPapuciDeCamera,hasHalat);
    }

    @Override
    public AbstractBuilder02 hasPatRabatabil(boolean arePatRabatabil) {
        this.hasPatRabatabil=arePatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 hasMicDejunInclus(boolean areMicDejunInclus) {
        this.hasMicDejunInclus=areMicDejunInclus;
        return this;
    }

    @Override
    public AbstractBuilder02 hasPapuciDeCamera(boolean arePapuciDeCamera) {
        this.hasPapuciDeCamera=arePapuciDeCamera;
        return this;
    }

    @Override
    public AbstractBuilder02 hasHalat(boolean areHalat) {
        this.hasHalat=areHalat;
        return this;
    }
}
