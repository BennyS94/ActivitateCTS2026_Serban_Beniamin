package ro.ase.cts.fasade.seminar6.calse;

public class Salon {
    private boolean[] paturiLibere=new boolean[10];

    public Salon() {
        for(int i=0;i<10;i++)
        paturiLibere[i]=true;
        this.paturiLibere = paturiLibere;
    }

    public int getPatLiber(){
        for(int i=0;i<this.paturiLibere.length;i++)
            if(paturiLibere[i]==true) {
                return i;
            }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i]=false;
        System.out.println("Patul "+ i+ " a fost ocupat cu succes!");
    }
}
