package ro.ase.cts.prototype.exercitiu1.clase;

import ro.ase.cts.builder.exercitiu1.clase.AutobuzLinie;

public class Autobuz implements PrototypeAutobuz{
    String model;
    int nrLocuri;
    double capacitateMotor;
    int idInventar;

    public Autobuz(String model, int nrLocuri, double capacitateMotor, int idInventar) {
        if(model.length()<3)
            this.model="Nespecificat";
        else
            this.model = model;

        if(nrLocuri<10)
            this.nrLocuri=10;
        else
            this.nrLocuri = nrLocuri;

        if(capacitateMotor<3.0)
            this.capacitateMotor=3.0;
        else
            this.capacitateMotor = capacitateMotor;

        if(Integer.toString(idInventar).length()<4)
            this.idInventar=1000;
        else
            this.idInventar = idInventar;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public void setCapacitateMotor(double capacitateMotor) {
        this.capacitateMotor = capacitateMotor;
    }

    public void setIdInventar(int idInventar) {
        this.idInventar = idInventar;
    }

    private Autobuz(){
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", capacitateMotor=" + capacitateMotor +
                ", idInventar=" + idInventar +
                '}';
    }

    @Override
    public PrototypeAutobuz clone() {
        Autobuz autobuz=new Autobuz();
        autobuz.setModel(this.model);
        autobuz.setNrLocuri(this.nrLocuri);
        autobuz.setCapacitateMotor(this.capacitateMotor);
        autobuz.setIdInventar(this.idInventar+100);
        return autobuz;
    }
}
