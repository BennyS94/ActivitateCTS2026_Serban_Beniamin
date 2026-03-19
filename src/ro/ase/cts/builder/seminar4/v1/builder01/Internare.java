package ro.ase.cts.builder.seminar4.v1.builder01;

// pat rabatabil
// mic dejun inclus
// papuci de camera
// halat pentru interior
public class Internare {
    private String numePacient;

    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalat;

    public Internare() {
        numePacient="Marius";
        hasPatRabatabil=false;
        hasHalat=false;
        hasMicDejunInclus=false;
        hasPapuciDeCamera=false;
    }

    public Internare(String numePacient, boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuciDeCamera, boolean hasHalat) {
        this.numePacient = numePacient;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalat = hasHalat;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public void setMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    public void setPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    public void setHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "numePacient='" + numePacient + '\'' +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejunInclus=" + hasMicDejunInclus +
                ", hasPapuciDeCamera=" + hasPapuciDeCamera +
                ", hasHalat=" + hasHalat +
                '}';
    }
}
