package ro.ase.cts.builder.seminar4.v1.builder02;

// pat rabatabil
// mic dejun inclus
// papuci de camera
// halat pentru interior
public interface AbstractBuilder02 {
    Internare02 build(String numePacient);
    AbstractBuilder02 hasPatRabatabil(boolean arePatRabatabil);
    AbstractBuilder02 hasMicDejunInclus(boolean areMicDejunInclus);
    AbstractBuilder02 hasPapuciDeCamera(boolean arePapuciDeCamera);
    AbstractBuilder02 hasHalat(boolean areHalat);

}
