package ro.ase.cts.singleton.seminar3_lazy.clase;

public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarCamereInchiriate;
    private int numarAngajati;

    public void afisareInchiriereCamera(){
        if(numarCamere == numarCamereInchiriate) {
            System.out.println("Nu mai exita camere disponibile");
        }else {
            numarCamereInchiriate++;
            System.out.println("Camera a fost inchiriata cu succes!");
        }
    }
    public void afiseazaDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append(denumireHotel);
        sb.append(" cu un nr de camere :");
        sb.append(numarCamere);
        sb.append(" si un nr de angajati:");
        sb.append(numarAngajati);
        sb.append(" si numar camere inchiriate: ");
        sb.append(numarCamereInchiriate);
        System.out.println(sb);
    }

    public Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.numarCamereInchiriate = 0;
        this.numarAngajati = numarAngajati;
    }

    private static Hotel instanta = null;
    //synchronized
    public static synchronized Hotel getInstance(String denumire, int nrCamere,int numarAngajati){
        if(instanta == null){
            instanta = new Hotel(denumire,nrCamere,numarAngajati);
        }
        return instanta;
    }

}
