package Test;

import java.util.ArrayList;

/**
 *
 * @author Loredana
 */
public class GUIDreptunghi extends javax.swing.JDialog {

    /**
     * Creates new form GUIDreptunghi
     */
    public GUIDreptunghi() {

        initComponents();

    }
    Dreptunghi dr = new Dreptunghi();
    String mesajLatime, mesajLungime;
    double latime, lungime;
    ArrayList<Dreptunghi> vectDr = new ArrayList<Dreptunghi>();  //am creat un vector care nu are o limita de elemente impusa

    private void creareVector() {
        Dreptunghi d1 = new Dreptunghi();
        Dreptunghi d2 = new Dreptunghi(3.0, 4.0);
        Dreptunghi d3 = new Dreptunghi(2, 7);
        Dreptunghi d4 = new Dreptunghi(6, 8);

        vectDr.add(d1);
        vectDr.add(d2);
        vectDr.add(d3);
        vectDr.add(d4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        latura1 = new javax.swing.JLabel();
        latura2 = new javax.swing.JLabel();
        LatimeEcran = new javax.swing.JTextField();
        LungimeEcran = new javax.swing.JTextField();
        butonArie = new javax.swing.JButton();
        butonPerimetru = new javax.swing.JButton();
        ecranAfisarePerimetru = new javax.swing.JTextField();
        ecranAfisareArie = new javax.swing.JTextField();
        butonMaiMulte = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAfisareTot = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        vectorLista = new javax.swing.JComboBox<>();
        butonArieCeaMaiMare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ecranArieCeaMaiMare = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        jLabel1.setText("Dreptunghi");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 78, -1, 93));

        latura1.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        latura1.setText("Latime");
        latura1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(latura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 197, 119, 34));

        latura2.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        latura2.setText("Lungime");
        getContentPane().add(latura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 249, 119, 34));

        LatimeEcran.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        LatimeEcran.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LatimeEcranFocusLost(evt);
            }
        });
        LatimeEcran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LatimeEcranMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LatimeEcranMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LatimeEcranMouseReleased(evt);
            }
        });
        getContentPane().add(LatimeEcran, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 166, 34));

        LungimeEcran.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        LungimeEcran.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LungimeEcranFocusLost(evt);
            }
        });
        getContentPane().add(LungimeEcran, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 166, 34));

        butonArie.setBackground(new java.awt.Color(204, 0, 0));
        butonArie.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        butonArie.setText("Arie");
        butonArie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonArieActionPerformed(evt);
            }
        });
        getContentPane().add(butonArie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 151, 54));

        butonPerimetru.setBackground(new java.awt.Color(204, 0, 0));
        butonPerimetru.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        butonPerimetru.setText("Perimetru");
        butonPerimetru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonPerimetruActionPerformed(evt);
            }
        });
        getContentPane().add(butonPerimetru, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 151, 60));

        ecranAfisarePerimetru.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        ecranAfisarePerimetru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecranAfisarePerimetruActionPerformed(evt);
            }
        });
        getContentPane().add(ecranAfisarePerimetru, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 211, 39));

        ecranAfisareArie.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        getContentPane().add(ecranAfisareArie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 211, 39));

        butonMaiMulte.setBackground(new java.awt.Color(204, 0, 0));
        butonMaiMulte.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        butonMaiMulte.setText("Mai multe");
        butonMaiMulte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonMaiMulteActionPerformed(evt);
            }
        });
        getContentPane().add(butonMaiMulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 151, 52));

        textAfisareTot.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        textAfisareTot.setMinimumSize(new java.awt.Dimension(10, 10));
        jScrollPane2.setViewportView(textAfisareTot);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 392, 88));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setText("Exemple dreptunghiuri:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 165, -1, 31));

        vectorLista.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        vectorLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------", "Dreptunghi 1", "Dreptunghi 2", "Dreptunghi 3", "Dreptunghi 4" }));
        vectorLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vectorListaActionPerformed(evt);
            }
        });
        getContentPane().add(vectorLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 203, 160, 30));

        butonArieCeaMaiMare.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        butonArieCeaMaiMare.setText("cea mai mare arie ");
        butonArieCeaMaiMare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonArieCeaMaiMareActionPerformed(evt);
            }
        });
        getContentPane().add(butonArieCeaMaiMare, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 299, -1, 34));

        ecranArieCeaMaiMare.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(ecranArieCeaMaiMare);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 303, 95, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Loredana\\Desktop\\Test\\src\\Test\\resursePoze\\generic.jpg")); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ecranAfisarePerimetruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecranAfisarePerimetruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecranAfisarePerimetruActionPerformed

    private void butonMaiMulteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonMaiMulteActionPerformed
        // TODO add your handling code here:
        try {
            latime = Double.parseDouble(mesajLatime);              //daca laturile citite sunt numere 
            lungime = Double.parseDouble(mesajLungime);
            
            if (lungime > 0 && latime > 0) {
                if(textAfisareTot.isEnabled()==false){
                    textAfisareTot.setEnabled(true);
                }
                textAfisareTot.setText(dr.toString());

            } 

        } catch (Exception e) {   //daca nu sunt numere 
            textAfisareTot.setText("");   //astfel se goleste casuta cu "MAI MULTE"
            textAfisareTot.setEnabled(false);   //ea nu va mai putea fi editabila,deci nu va mai aparea nimic,dezactivata

        }
    }//GEN-LAST:event_butonMaiMulteActionPerformed


    private void butonPerimetruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonPerimetruActionPerformed
        // TODO add your handling code here:

        mesajLatime = LatimeEcran.getText();
        mesajLungime = LungimeEcran.getText();

        try {                                             //se verifica daca sunt numere sau alte caractere
            latime = Double.parseDouble(mesajLatime);
            lungime = Double.parseDouble(mesajLungime);
            if (lungime > 0 && latime > 0) {
                if (textAfisareTot.isEnabled() == false) {  //daca este dezactivata casuta de "mai multe"
                    textAfisareTot.setEnabled(true);   //se activeaza din nou
                }
                dr.setLatura1(latime);
                dr.setLatura2(lungime);

                double perim = dr.calculPerimetru();
                dr.calculDiagonala(dr.getLatura1(), dr.getLatura2());

                System.out.println("Perimetrul este " + perim);
                ecranAfisarePerimetru.setText(Double.toString(perim));
            }
        } catch (Exception e) { //alte erori,mai ales cele in care nu estenumar,ci este altceva cee ce se citeste de la diemnsiuni

            ecranAfisarePerimetru.setText("EROARE! Dim incorecte");
            System.out.println("EROARE! Dimensiuni incorecte");
        }

    }//GEN-LAST:event_butonPerimetruActionPerformed

    private void butonArieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonArieActionPerformed
        // TODO add your handling code here:
        mesajLatime = LatimeEcran.getText();   //se extrag stringurile citite in casuta alba
        mesajLungime = LungimeEcran.getText();

        try {                                            //se verifica daca sunt numere sau alte caractere
            latime = Double.parseDouble(mesajLatime);
            lungime = Double.parseDouble(mesajLungime);
            if (lungime > 0 && latime > 0) {   //cazul favorit
                if (textAfisareTot.isEnabled() == false) {  //daca este dezactivata casuta de "mai multe"
                    textAfisareTot.setEnabled(true);   //se activeaza din nou
                }
                dr.setLatura1(latime);
                dr.setLatura2(lungime);

                dr.calculArie();
                double arie = dr.getArie();

                System.out.println("Aria este " + arie);
                ecranAfisareArie.setText(Double.toString(arie));

            } 

        } catch (Exception e) { //alte erori,mai ales cele in care nu estenumar,ci este altceva cee ce se citeste de la diemnsiuni

            ecranAfisareArie.setText("EROARE! Dim incorecte");
            System.out.println("EROARE! Dimensiuni incorecte");
        }


    }//GEN-LAST:event_butonArieActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        GUImain meniu = new GUImain();  //aici cand se inchide fereasra,sa se deschida meniul initial
        meniu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void LatimeEcranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LatimeEcranMouseExited
        // TODO add your handling code here:       
    }//GEN-LAST:event_LatimeEcranMouseExited

    private void LatimeEcranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LatimeEcranMouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_LatimeEcranMouseClicked

    private void LatimeEcranMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LatimeEcranMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_LatimeEcranMouseReleased

    private void LatimeEcranFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LatimeEcranFocusLost
        // TODO add your handling code here:
        mesajLatime = LatimeEcran.getText();    //identic ca la lungime ecran numai ca sunt mici modificari
        try {
            latime = Double.parseDouble(mesajLatime); //daca este numar sau nu
            if (latime <= 0) {

                LatimeEcran.setText("EROARE! Negativ");
                System.out.println("EROARE! Negativ");

            }
            if (latime > 100) {
                LatimeEcran.setText("EROARE! Depasit");
            }
        } catch (NumberFormatException e) {
            if(mesajLatime.isEmpty()){
                LatimeEcran.setText("");
            }else{
            LatimeEcran.setText("EROARE! Nan");
            System.out.println("EROARE! Nan");}
        }


    }//GEN-LAST:event_LatimeEcranFocusLost

    private void LungimeEcranFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LungimeEcranFocusLost
        // TODO add your handling code here:  cand se apasa pe alte casute/butoane,doar atunci va aparea eroarea
        mesajLungime = LungimeEcran.getText();
        try {
            lungime = Double.parseDouble(mesajLungime);
            if (lungime <= 0) {
                LungimeEcran.setText("EROARE! Negativ");
                System.out.println("EROARE! Negativ");
            }
            if (lungime > 100) {  //sa fie mai mic decat 100

                LungimeEcran.setText("EROARE! Depasit");
            }
        } catch (NumberFormatException e) {
            if(mesajLungime.isEmpty()){
              LungimeEcran.setText("");
            }else{
            LungimeEcran.setText("EROARE! Nan");  //eroare not a number
            System.out.println("EROARE! Nan");   //afisare in linie de comanda
            }
            
        }


    }//GEN-LAST:event_LungimeEcranFocusLost

    private void vectorListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vectorListaActionPerformed
        // TODO add your handling code here:

        LatimeEcran.setText("");        //aici cele 4 casute ca sa se stearga datele precedente,sa fie gol
        LungimeEcran.setText("");
        ecranAfisarePerimetru.setText("");
        ecranAfisareArie.setText("");
        textAfisareTot.setEnabled(true);
        creareVector();
        String optiune = String.valueOf(vectorLista.getSelectedItem());  //pentru a alege din valorile prestabilite

        switch (optiune) {
            case "---------------": {
               textAfisareTot.setText("");
               break;
            }
            case "Dreptunghi 1": {
                textAfisareTot.setText(vectDr.get(0).toString());
                break;
            }
            case "Dreptunghi 2": {
                textAfisareTot.setText(vectDr.get(1).toString());
                break;
            }
            case "Dreptunghi 3": {
                textAfisareTot.setText(vectDr.get(2).toString());
                break;
            }
            case "Dreptunghi 4": {
                textAfisareTot.setText(vectDr.get(3).toString());
                break;
            }

        }


    }//GEN-LAST:event_vectorListaActionPerformed

    private void butonArieCeaMaiMareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonArieCeaMaiMareActionPerformed
        // TODO add your handling code here:
        LatimeEcran.setText("");        //aici cele 4 casute ca sa se stearga datele precedente,sa fie gol
        LungimeEcran.setText("");
        ecranAfisarePerimetru.setText("");
        ecranAfisareArie.setText("");
        textAfisareTot.setText("");
        creareVector();
        double maxi;
        maxi = vectDr.get(0).getArie();
        for (int i = 1; i < vectDr.size(); i++) {
            if (vectDr.get(i).getArie() > maxi) {
                maxi = vectDr.get(i).getArie();
            }
        }
        ecranArieCeaMaiMare.setText(Double.toString(maxi));

    }//GEN-LAST:event_butonArieCeaMaiMareActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIDreptunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDreptunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDreptunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDreptunghi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDreptunghi().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LatimeEcran;
    private javax.swing.JTextField LungimeEcran;
    private javax.swing.JButton butonArie;
    private javax.swing.JButton butonArieCeaMaiMare;
    private javax.swing.JButton butonMaiMulte;
    private javax.swing.JButton butonPerimetru;
    private javax.swing.JTextField ecranAfisareArie;
    private javax.swing.JTextField ecranAfisarePerimetru;
    private javax.swing.JTextPane ecranArieCeaMaiMare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel latura1;
    private javax.swing.JLabel latura2;
    private javax.swing.JTextPane textAfisareTot;
    private javax.swing.JComboBox<String> vectorLista;
    // End of variables declaration//GEN-END:variables
}