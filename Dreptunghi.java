package Test;

public class Dreptunghi extends Patrulater {

    private double diagonala;

    Dreptunghi() {   //constructor fara argumente
        super();
        this.diagonala = 0.0;
    }

    Dreptunghi(double latime, double lungime) {  //constructor cu argumente
        super();
        if (latime < 0 || lungime < 0) {
            System.out.println("Nu se poate forma figura!");
        } else if (latime > 0 && lungime > 0) {
            latura1 = latura3 = latime;
            latura2 = latura4 = lungime;
            super.calculPerimetru();
            this.calculArie();
            this.calculDiagonala(latime, lungime);
        }
    }

    Dreptunghi(Dreptunghi d) {  //constructor de copiere
        super(d);
        this.diagonala = d.diagonala;

    }

    public String toString() {

        return "\n Latimea unui dreptunghi = " + super.getLatura1() + " , \nlungimea = " + super.getLatura2()
                +"\n Diagonala este ="+this.diagonala
                + "\n Perimetrul dreptunghiului = " + super.getPerimetru()
                + "\n Aria dreptunghiului = " + super.getArie() + "\n";
    }

    public double calculArie() {
        super.arie = super.latura1 * super.latura2;
        return super.arie;
    }

    public double calculDiagonala(double latime, double lungime) {
        this.diagonala = Math.sqrt(Math.pow(latime, 2) + Math.pow(lungime, 2));
        return this.diagonala;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
        this.latura3 = latura1;  //latime cu latime
       

    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
        this.latura4 = latura2; //lungime cu lungime
        

    }

 
}
