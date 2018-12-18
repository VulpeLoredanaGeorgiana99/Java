package Test;

public class Patrat extends Patrulater {

    private double diagonala;

    Patrat() {
        super();
        this.diagonala = 0.0;
    }

    public Patrat(double latura) {
        super();
        if (latura < 0) {
            System.out.println("Nu se poate forma un patrat");
        } else {
            latura1 = latura;
            latura2 = latura;
            latura3 = latura;
            latura4 = latura;
            this.calculArie();
            this.calculPerimetru();
            this.calculDiagonala();
        }
    }

    public String toString() {
        return " Latura unui patrat = " + super.getLatura1() + "\n"
                +" Diagonala patratului = "+this.diagonala + "\n"
                + " Perimetrul patratului = " + super.getPerimetru() + "\n"
                + " Aria patratului = " + super.getArie() + "\n";
    }

    public void setLatura(double latura) {
        this.latura1 = latura;

    }

    public double calculPerimetru() {
        super.perimetru = 4 * latura1;
        return super.perimetru;
    }

    public double calculArie() {
        super.arie = super.latura1 * super.latura1;
        return super.arie;
    }

    public double calculDiagonala() {
        this.diagonala = super.latura1 * Math.sqrt(2);
        return this.diagonala;
    }

}
