package Test;

public class Trapez extends Patrulater {

    private double inaltime;
    private double linieMijlocie;

    Trapez() {
        super();
        this.inaltime = 0.0;
        this.linieMijlocie = 0.0;

    }

    Trapez(double latura1, double latura2, double latura3, double latura4, double inaltime) {
        //constructor cu parametrii si pentru laturile din clasa parinte Patrulater si pentru clasa curenta
        super(); //se mostenesc valorile campurilor din clasa parinte
        if (latura1 < 0 || latura2 < 0 || latura3 < 0 || latura4 < 0) {
            System.out.println("Nu se poate forma un trapez");
        } else {
            super.latura1 = latura1;
            super.latura2 = latura2;
            super.latura3 = latura3;
            super.latura4 = latura4;
            this.inaltime = inaltime;
            this.linieMijlocie = (this.getLatura1() + this.getLatura2()) / 2; //se seteaza valoarea liniei mijlocii
            this.setArie(this.linieMijlocie * this.inaltime);   //se calculeaza aria daca se stiu laturile si inaltimea
            this.setPerimetru(this.getLatura1() + this.getLatura2() + this.getLatura3() + this.getLatura4());   //se calculeaza perimetrul
        }
    }

    public Trapez(Trapez p) { //constrcutor de copiere
        super(p);
        this.inaltime = p.inaltime;
        this.linieMijlocie = p.linieMijlocie;
    }

    public String toString() {
        return "\n Dimensiunile trapezului sunt " + super.getLatura1() + " , " + super.getLatura2() + " , " + super.getLatura3() + " , " + super.getLatura4()
                +"\n Inaltimea este: "+this.inaltime
                +"\n Linia mijlocie este: "+this.linieMijlocie
                + "\n Aria trapezului este: " + this.getArie()
                + "\n Perimetrul este: " + this.getPerimetru();
    }

    public void calculeazaAria() {   //in cazul in care constructorul are doar parametrul inaltime dar nu are parametrii pentru
        //laturi, adica se apeleaza constructorul fara parametrii din Patrulater, totusi se poate calcula aria cu o metoda, daca se seteaza
        // ulterior valorile laturilor
        this.linieMijlocie = (this.getLatura1() + this.getLatura2()) / 2;
        this.setArie(this.linieMijlocie * this.inaltime);
    }

    public void calculeazaPerimetrul() { //aceeasi idee ca si la metoda de calcul a ariei de mai sus
        this.setPerimetru(this.getLatura1() + this.getLatura2() + this.getLatura3() + this.getLatura4());
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
      
    }

    public double getLinieMijlocie() {
        return linieMijlocie;
    }

}
