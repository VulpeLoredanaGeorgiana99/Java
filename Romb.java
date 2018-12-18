package Test;

public class Romb extends Patrulater {

    private double masuraUnghi1;
    //sa bagam aria la copii

    Romb() { //constructor fara parametru
        super();

    }

    Romb(double latura, double masuraUnghi1) {
        super();
        if (latura < 0) {
            System.out.println("Nu se poate forma un romb");
        } else {
            latura1 = latura2 = latura3 = latura4 = latura;
            this.masuraUnghi1 = masuraUnghi1;
            this.calculArie();
            this.calculPerimetru();
        }

    }

    Romb(Romb r) {

        super(r);
        this.masuraUnghi1 = r.masuraUnghi1;

    }

    public String toString() {
        return "\nLungimea unei laturi a rombului = " + super.getLatura1() 
                + " \nMasura unghiului intre 2 laturi = " + this.masuraUnghi1 
                + " \nPerimetrul rombului = " + super.getPerimetru() 
                + " \nAria rombului = " + super.getArie() ;

    }

    public void setLatura(double latura) {
        super.latura1 = latura;
       
    }
    
    public void setMasuraUnghi(double unghi){
        this.masuraUnghi1=unghi;
    }

    public double calculPerimetru() {
        super.perimetru = 4 * super.latura1;
        return perimetru;
    }

    public double calculArie() {

        super.arie = super.latura1 * super.latura1 * Math.sin(masuraUnghi1);  //am modificat putin aici pt ca formula cu heron nu mergea
        return super.arie;                                             //din cauza ca nu se stie macar o diagonala ca sa poti forma un triunghi
    }  //formula este de pe net a*b*sin(unghiul dintre a si b)

}
