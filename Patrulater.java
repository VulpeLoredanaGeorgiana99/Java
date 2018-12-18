package Test;

public class Patrulater {

    protected double latura1;
    protected double latura2;
    protected double latura3;
    protected double latura4;
    protected double perimetru;
    protected double arie;

    Patrulater() {

        this.latura1 = 0.0;
        this.latura2 = 0.0;
        this.latura3 = 0.0;
        this.latura4 = 0.0;
        this.perimetru = 0.0;
        this.arie = 0.0;

    }

    Patrulater(double latura1, double latura2, double latura3, double latura4) {

        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;

    }

    Patrulater(Patrulater p) {  //constructor de copiere

        this.latura1 = p.latura1;
        this.latura2 = p.latura2;
        this.latura3 = p.latura3;
        this.latura4 = p.latura4;
        this.perimetru = p.perimetru;
        this.arie = p.arie;

    }

    void afisare() {
        System.out.println("Patrulater cu laturile de lungimi :" + latura1 + "," + latura2 + " , " + latura3
                + " , " + latura4);
    }

    public String toString() {
        return "\n Patrulater cu laturile de lungimi :\n " + latura1 + " ,\n " + latura2 + " ,\n " + latura3
                + " ,\n " + latura4 + " \n Perimetru este  "+calculPerimetru()+"\n";
    }

    public double getPerimetru() {
        return perimetru;
    }

    public double getArie() {
        return arie;
    }

    public void setArie(double arie) {
        this.arie = arie;
    }

    public void setPerimetru(double perimetru) {
        this.perimetru = perimetru;
    }

    public double calculPerimetru() {
        perimetru = latura1 + latura2 + latura3 + latura4;
        return perimetru;
    }

    public double getLatura1() {
        return this.latura1;
    }

    public double getLatura2() {
        return this.latura2;
    }

    public double getLatura3() {
        return this.latura3;
    }

    public double getLatura4() {
        return this.latura4;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }

    public void setLatura2(double latura2) {
        this.latura2 = latura2;
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
    }

    public void setLatura4(double latura4) {
        this.latura4 = latura4;
    }

}
