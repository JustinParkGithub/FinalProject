package finalproject;

import java.util.ArrayList;

public class GameOver extends javax.swing.JFrame {

    /**
     * Creates new form GameOver
     */
    public GameOver() {
        initComponents();
    }
    
    public void resetGameOver() {
        scoreLabel.setText("Score: ");
        timeLabel.setText("Time: ");
        wordsTypedTextArea.setText("");
    }

    public void setTextArea(ArrayList<String> arrList) {
        String textAreaWords = "";
        for(int i=0; i<arrList.size()-1;i++) { 
            textAreaWords = textAreaWords + arrList.get(i) + "\n";
        }
        wordsTypedTextArea.setText(textAreaWords);
    }
    
    public void setScoreLabel(String score) {
        scoreLabel.setText(score);
    }
    
    public void setTimeLabel(String time) {
        timeLabel.setText("Time: " + time);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameOverLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordsTypedTextArea = new javax.swing.JTextArea();
        wordsTypedLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Over");
        setResizable(false);

        gameOverLabel.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setText("GAME OVER");

        scoreLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        scoreLabel.setText("SCORE:");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        timeLabel.setText("TIME:");

        wordsTypedTextArea.setColumns(20);
        wordsTypedTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        wordsTypedTextArea.setRows(5);
        wordsTypedTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        wordsTypedTextArea.setEnabled(false);
        wordsTypedTextArea.setFocusable(false);
        jScrollPane1.setViewportView(wordsTypedTextArea);

        wordsTypedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wordsTypedLabel.setText("WORDS TYPED:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("BACK TO MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wordsTypedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(gameOverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordsTypedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Brings user back to the title - Written by Justin
        TypingGame.titleFrameVisible();
        resetGameOver();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameOverLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel wordsTypedLabel;
    private javax.swing.JTextArea wordsTypedTextArea;
    // End of variables declaration//GEN-END:variables
}
