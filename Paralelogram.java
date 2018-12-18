package Test;

public class Paralelogram extends Patrulater {

    private double inaltime;
    private double unghi;

    Paralelogram(double latura1, double latura2, double inaltime, double unghi) {
        super();
        if (latura1 < 0 || latura2 < 0) {
            System.out.println("Nu se poate forma un paralelogram");
        } else {
            super.latura1 = latura1;
            super.latura2 = latura2;
            super.latura3 = latura1;
            super.latura4 = latura2;
            this.inaltime = inaltime;
            this.unghi = unghi;
            this.calculeazaPerimetrul();
            this.calculeazaAria();
        }
    }

    Paralelogram() {
        super();
        this.inaltime = 0.0;
        this.unghi = 0;
    }

    public Paralelogram(Paralelogram p) {
        super(p);
        this.inaltime = p.inaltime;;
        this.unghi = p.unghi;
    }

    public String toString() {
        return "\n Dimensiunile paralelogramului " + super.getLatura1() + " si " + super.getLatura2()
                + "\n Aria paralelogramului: " + this.getArie()
                + "\n Perimetrul paralelogramului: " + this.getPerimetru() ; //+lungimile laturilor
    }  //aici sa punem si 2 dimensiuni,latura 1 si latura 2 pt ca lat 3 si 4 se repeta

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getUnghi() {
        return unghi;
    }

    public void setUnghi(double unghi) {
        this.unghi = unghi;
    }

    public void calculeazaPerimetrul() {
        this.setPerimetru(this.getLatura1() + this.getLatura2() + this.getLatura3() + this.getLatura4());
    }

    public void calculeazaAria() {   //in cazul in care constructorul are doar parametrul inaltime dar nu are parametrii pentru
        //laturi, adica se apeleaza constructorul fara parametrii din Patrulater, totusi se poate calcula aria cu o metoda, daca se seteaza
        // ulterior valorile laturilor
        //this.setArie(this.getLatura1() * this.getLatura2() * unghi);
        this.setArie(this.getLatura1() * inaltime);
    }

}
