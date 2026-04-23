package ro.ase.cts.fasade.seminar6.calse;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate()>5 && medic.aInregistratPacientul(pacient)){
            if(salon.getPatLiber()!=-1){
                System.out.println("Pacientul "+pacient.getNume() +
                        " este internat in patul "+ salon.getPatLiber() + ".");
                salon.ocupaPat(salon.getPatLiber());
            }
            else
                System.out.printf("Nu exista loc disponibil.");
        }
        else
            System.out.printf("Paicentul nu are trimitere si nu necesita internare.");
    }
}
