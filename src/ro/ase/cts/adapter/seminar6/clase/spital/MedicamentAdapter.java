package ro.ase.cts.adapter.seminar6.clase.spital;

import ro.ase.cts.adapter.seminar6.clase.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {
    ro.ase.cts.adapter.seminar6.clase.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.ase.cts.adapter.seminar6.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }


}
