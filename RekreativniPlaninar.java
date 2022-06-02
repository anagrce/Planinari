public class RekreativniPlaninar extends Planinar{

    private double tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(int id, int brojPoena, String ime, String prezime,
                               double tezinaOpreme, String nazivOkruga, double maxUspon) {
        super(id, brojPoena, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }
    @Override
    public double clanarina(){
        double clanarina = 1000 - (1000*0.01*getBrojPoena());
        if(clanarina>=0){
            return clanarina;
        }else {
            return 0;
        }

    }
    @Override
    public boolean uspesanUspon(Planina p){
        if(this.maxUspon - 50*this.tezinaOpreme > p.getVisina()){
            int noviBrojPoena = getBrojPoena();
            setBrojPoena(noviBrojPoena+1);
            return  true;
        }else {
            return false;
        }
    }
}
