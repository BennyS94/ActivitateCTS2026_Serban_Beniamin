package ro.ase.cts.fasade.seminar6.calse;

public class Medic {

    public boolean aInregistratPacientul(Pacient pacient){
      return pacient.getGravitate()>5;
    }
}
