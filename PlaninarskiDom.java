import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;
    }
    public ArrayList<Planinar> getClanoviDoma(){
        return clanoviDoma;
    }
    public void uclaniPlaninara(Planinar p){
        this.clanoviDoma.add(p);
    }
    public int uspaesnoPopeli(){
        int brojPlaninara=0;
        for(int i=0; i<clanoviDoma.size();i++){
            if(clanoviDoma.get(i).getBrojPoena()>0){
                brojPlaninara++;
            }
        }return brojPlaninara;
    }
    public void izbaciPlaninara(int id){
        for(int i=0;i<clanoviDoma.size();i++){
            if(clanoviDoma.get(i).getId()==id){
                clanoviDoma.remove(i);

            }
        }
    }
    public double mesecniPrihod(){
        double mesecniPrihod=0;
        for(int i=0; i<clanoviDoma.size();i++){
            mesecniPrihod=mesecniPrihod+clanoviDoma.get(i).clanarina();
        }
        return mesecniPrihod;
    }
    public ArrayList<Planinar> sortPlaninari(){
        Collections.sort(this.getClanoviDoma());
        return this.getClanoviDoma();
    }
}
