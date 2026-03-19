package ro.ase.cts.builder.seminar4.v1.builder01;

// pat rabatabil
// mic dejun inclus
// papuci de camera
// halat pentru interior
public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder hasPatRabatabil(boolean arePatRabatabil);
    AbstractBuilder hasMicDejunInclus(boolean areMicDejunInclus);
    AbstractBuilder hasPapuciDeCamera(boolean arePapuciDeCamera);
    AbstractBuilder hasHalat(boolean areHalat);

}
