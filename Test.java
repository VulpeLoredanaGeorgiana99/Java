package Test;

import java.util.ArrayList;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
       
        Patrulater p0 = new Patrulater();
        Patrulater p1 = new Patrulater(-2, 3, 4, 2.5);
        Patrulater p2 = new Patrulater(2, 3, 4, 2.1);

        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("---------------");
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi(3.0, 4.0);
        Dreptunghi d3 = new Dreptunghi(2, 7);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("---------------");
        Patrat pt1, pt2, pt3;
        pt1 = new Patrat();
        pt2 = new Patrat(7);
        pt3 = new Patrat(3);

        pt1.calculPerimetru();
        pt2.calculArie();
        pt2.calculPerimetru();
        pt3.calculPerimetru();
        
        pt3.calculArie();
        
        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt3);

        System.out.println("---------------");

        Romb r1, r2, r3;
        r1 = new Romb();
        r2 = new Romb(4, 30);
        r3 = new Romb(5, 45);
       
        r1.calculPerimetru();
        r1.calculArie();
        r2.calculPerimetru();
        r2.calculArie();
        r3.calculPerimetru();
        r3.calculArie();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("---------------");

        Paralelogram pa1 = new Paralelogram();
        Paralelogram pa2 = new Paralelogram(2, 4, 1.2, 30);
        Paralelogram pa3 = new Paralelogram(4, 3, 2.5, 45);
        pa2.calculeazaPerimetrul();
        pa2.calculeazaAria();
        System.out.println(pa1);
        System.out.println(pa2);
        System.out.println(pa3);

        System.out.println("---------------");

        Trapez t1, t2, t3;
        t1 = new Trapez();
        t2 = new Trapez(2, 4, 5, 3, 3.50);
        t3 = new Trapez(4, 3, 2, 3.3, 2.5);
        t2.calculeazaPerimetrul();
        t2.calculeazaAria();
        t3.calculeazaPerimetrul();

        System.out.println(t1);
        System.out.println(t2);

        t2.setLatura1(7);
        t2.calculeazaAria();
        t2.calculeazaPerimetrul();
        System.out.println(t2);

        //--------------------------------------------------------------------------------------------------
        //SAPT 6 
        ArrayList<Patrulater> vector = new ArrayList<Patrulater>(); //aici in loc de arraylist se poate scrie vector
        vector.add(p0);
        vector.add(p1);
        vector.add(p2);
        vector.add(d1);
        vector.add(d3);
        vector.add(d2);
        vector.add(pt1);
        vector.add(pt2);
        vector.add(pt3);
        vector.add(pa2);
        vector.add(pa1);
        vector.add(pa3);
        vector.add(r1);
        vector.add(r2);
        vector.add(t3);
        vector.add(t2);
        System.out.println(vector.size());

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Elementul " + (i + 1) + " : " + vector.get(i).toString());
        }
        System.out.println();
        //--------------------------------------------------------------------------------------------------
        //SAPT 7
        //afisare cea mai mare arie din vectorul de elemente
        double maxim = vector.get(0).getArie();

        Patrulater el = new Patrulater();
        for (int i = 1; i < vector.size(); i++) {
            double arie = vector.get(i).getArie();

            if (arie > maxim) {
                maxim = arie;
                el = vector.get(i);
            }

        }
        System.out.println("***Sa se afiseze din vector cea mai mare arie si datele despre figura aceasta ");
        System.out.println();
        System.out.println("Cea mai mare arie este " + maxim + " iar datele despre figura sunt " + el.toString());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUImain().setVisible(true);
            }
        });
    }

}
