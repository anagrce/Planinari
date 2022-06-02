import java.util.ArrayList;

public class Planina {

    private String ime;
    private String nazivDrzave;
    private double visina;

    public Planina(String ime, String nazivDrzave, double visina) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visina = visina;
    }

    public double getVisina() {
        return visina;
    }
    public Planina getNajvisaPlanina(ArrayList<Planina> planine){
        Planina najvisaPlanina = planine.get(0);
        for(Planina p : planine){
            if(p.getVisina()>najvisaPlanina.getVisina()){
                najvisaPlanina = p;

            }

        }return najvisaPlanina;
    }
}
