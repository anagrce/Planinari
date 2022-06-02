public abstract class Planinar implements Comparable<Planinar>{

    private int id, brojPoena;
    private String ime, prezime;

    public Planinar(int id, int brojPoena, String ime, String prezime) {
        this.id = id;
        this.brojPoena = brojPoena;
        this.ime = ime;
        this.prezime = prezime;
    }

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

    @Override
    public String toString(){
        return "Planinar{" + "id= " + id+ ", brojPoena= " + brojPoena +
                ", ime= " + ime+ " , prezime= " + prezime+" }";
    }
    public int getBrojPoena(){
        return brojPoena;
    }
    public void setBrojPoena(int brojPoena){
        this.brojPoena= brojPoena;
    }
    @Override
    public int compareTo(Planinar o){
        return o.brojPoena - brojPoena;
    }

    public int getId() {
        return id;
    }
}
