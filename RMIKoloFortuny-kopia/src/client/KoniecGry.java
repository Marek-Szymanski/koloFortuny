package client;

import server.klasy.Gra;

public class KoniecGry extends javax.swing.JDialog {
    Gra gra;
    public KoniecGry(java.awt.Frame parent, boolean modal, Gra gra) {
        super(parent, modal);
        this.gra = gra;
        initComponents();
        results();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLbl_Gracz1Result = new javax.swing.JLabel();
        jLbl_Winner1 = new javax.swing.JLabel();
        jLbl_Gracz4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLbl_WinnerResult = new javax.swing.JLabel();
        jLbl_Gracz5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLbl_Gracz2Result = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLbl_Gracz3Result = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLbl_Gracz6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Winner is: ");

        jLbl_Gracz1Result.setText("0");

        jLbl_Winner1.setText("Gracz");

        jLbl_Gracz4.setText("Gracz 3");

        jLabel8.setText("Result is: ");

        jLbl_WinnerResult.setText("0");

        jLbl_Gracz5.setText("Gracz 1");

        jLabel9.setText("Result is: ");

        jLbl_Gracz2Result.setText("0");

        jLabel10.setText("Result is: ");

        jLbl_Gracz3Result.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Koniec gry!");

        jLbl_Gracz6.setText("Gracz 2");

        jLabel12.setText("Result is: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLbl_Gracz4)
                        .addComponent(jLbl_Gracz6)
                        .addComponent(jLbl_Gracz5))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLbl_Gracz3Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLbl_Gracz2Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLbl_Gracz1Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbl_Winner1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_WinnerResult, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLbl_Winner1)
                    .addComponent(jLbl_WinnerResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLbl_Gracz1Result)
                    .addComponent(jLbl_Gracz5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_Gracz6)
                    .addComponent(jLabel10)
                    .addComponent(jLbl_Gracz2Result))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_Gracz4)
                    .addComponent(jLabel12)
                    .addComponent(jLbl_Gracz3Result))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void results(){
        String winner = gra.getWinner().getNazwa();
        String rsltWinner = Integer.toString(gra.getWinner().getStanKonta());
        String rsltGracz1 = Integer.toString(gra.getGracze().get(0).getStanKonta());
        String rsltGracz2 = Integer.toString(gra.getGracze().get(1).getStanKonta());
        String rsltGracz3 = Integer.toString(gra.getGracze().get(2).getStanKonta());
        jLbl_Winner1.setText(winner);
        jLbl_WinnerResult.setText(rsltWinner);
        jLbl_Gracz1Result.setText(rsltGracz1);
        jLbl_Gracz2Result.setText(rsltGracz2);
        jLbl_Gracz3Result.setText(rsltGracz3);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbl_Gracz1Result;
    private javax.swing.JLabel jLbl_Gracz2Result;
    private javax.swing.JLabel jLbl_Gracz3Result;
    private javax.swing.JLabel jLbl_Gracz4;
    private javax.swing.JLabel jLbl_Gracz5;
    private javax.swing.JLabel jLbl_Gracz6;
    private javax.swing.JLabel jLbl_Winner1;
    private javax.swing.JLabel jLbl_WinnerResult;
    // End of variables declaration//GEN-END:variables
}
