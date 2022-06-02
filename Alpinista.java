import java.util.ArrayList;

public class Alpinista extends Planinar{

    private ArrayList<Alpinista> tim;
    private int godineIskustva;

    public Alpinista(int id, int brojPoena, String ime, String prezime, ArrayList<Alpinista> tim, int godineIskustva) {
        super(id, brojPoena, ime, prezime);
        this.tim = tim;
        this.godineIskustva = godineIskustva;
    }

    @Override
    public double clanarina(){
        double clanarina = 1000 -(1000*0.04*getBrojPoena());
        if(clanarina>=0){
            return clanarina;

        }else {
            return 0;
        }
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        for(int i=0; i< tim.size();i++){
            if(tim.get(i).godineIskustva>=5){
                return true;
            }
        }
        return false;
    }
}
