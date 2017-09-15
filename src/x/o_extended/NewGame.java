package x.o_extended;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewGame extends JFrame {
    Frame frame;
    JFrame errorFrame;
    public NewGame() {
        initComponents();
        gameSize.setValue(9);
        errorFrame = new JFrame();
        errorFrame.setLocationRelativeTo(this);
        errorFrame.setAlwaysOnTop(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        player1name = new javax.swing.JTextField();
        player2name = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        gameSize = new javax.swing.JSlider();
        labela = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        player1.setText("Player 1");

        player2.setText("Player 2");

        size.setText("game size");
        size.setAlignmentX(0.5F);

        button.setText("Confirm");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        gameSize.setMaximum(10);
        gameSize.setValue(0);
        gameSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gameSizeStateChanged(evt);
            }
        });

        labela.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player1name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(size)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gameSize, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labela, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(player2name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1)
                    .addComponent(player1name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2)
                    .addComponent(player2name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        if(player1name.getText().isEmpty())
        {
            errorFrame.setVisible(true);
            JOptionPane.showMessageDialog(errorFrame, "Insert player 1 name");
            errorFrame.setVisible(false);
            player1name.grabFocus();
        }
        else if(player2name.getText().isEmpty())
        {
            errorFrame.setVisible(true);
            JOptionPane.showMessageDialog(errorFrame, "Insert player 2 name");
            errorFrame.setVisible(false);
            player2name.grabFocus();
        }
        else if(gameSize.getValue() < 0 ){//|| gameSize.getValue() > 15){
            errorFrame.setVisible(true);
            JOptionPane.showMessageDialog(errorFrame, "Game size is number between 9-15");
            errorFrame.setVisible(false);
            gameSize.grabFocus();
        }
        else{
            frame = new Frame();
            MainPanel panel = new MainPanel(player1name.getText(), 
                    player2name.getText(), gameSize.getValue() + 9);
            panel.setVisible(true);
            frame.getContentPane().add(panel);
            frame.setVisible(true);
            this.dispose();
            frame.pack();
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void gameSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gameSizeStateChanged
        labela.setText("" + (gameSize.getValue() + 9));
    }//GEN-LAST:event_gameSizeStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JSlider gameSize;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labela;
    private javax.swing.JLabel player1;
    private javax.swing.JTextField player1name;
    private javax.swing.JLabel player2;
    private javax.swing.JTextField player2name;
    private javax.swing.JLabel size;
    // End of variables declaration//GEN-END:variables
}
