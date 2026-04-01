package ro.ase.cts.singleton.exercitiu1.clase;

public class DispeceratCentral {

    private static DispeceratCentral instanta;
     String ultimulMesaj;
     int alerteTrimise;
     String numeDispecerat;

    private DispeceratCentral() {
        this.ultimulMesaj = "Nu exista mesaje anterioare";
        this.alerteTrimise = 0;
        this.numeDispecerat = "Dispecerat Central STB";
    }

    public static synchronized DispeceratCentral getInstance(){
        if(instanta == null)
            instanta=new DispeceratCentral();

        return instanta;
    }

    public void trimiteMesaj(String ultimulMesaj) {
        this.ultimulMesaj = ultimulMesaj;
        System.out.printf(this.numeDispecerat + "a inregistrat mesajul: " + this.ultimulMesaj);
    }

    public void trimiteAlertaGenerala() {
        this.alerteTrimise++;
        System.out.printf(this.numeDispecerat + "a inregistrat trimis o ALERTA GENERALA catre toate autobuzele.");
    }

    public void setNumeDispecerat(String numeDispecerat) {
        this.numeDispecerat = numeDispecerat;
    }
}
