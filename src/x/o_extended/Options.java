package x.o_extended;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Options extends javax.swing.JPanel {
    private JButton newGame;
    private JLabel player1;
    private JLabel player2;
    private JButton reset;
    private static JLabel result;
    static Fields naziv;
    static int scorePlayer1 = 0;
    static int scorePlayer2 = 0;
    static String play1;
    static String play2;
    public Options(final Fields ime, String player1, String player2) {
        naziv = ime;
        play1 = player1;
        play2 = player2;
        initComponents(player1, player2);
    }

    public static String getPlay1() {
        return play1;
    }

    public static String getPlay2() {
        return play2;
    }
    
    public static void Result(boolean player){
        if(player)
            scorePlayer1++;
       else
            scorePlayer2++;
        naziv.Clear();
        result.setText(scorePlayer1+":"+scorePlayer2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String playe1, String playe2) {

        player1 = new JLabel(playe1);
        result = new javax.swing.JLabel("0:0");
        player2 = new javax.swing.JLabel(playe2);
        reset = new javax.swing.JButton();
        newGame = new javax.swing.JButton();

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        newGame.setText("Nova Igra");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result)
                    .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        naziv.Clear();
    }                                     

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        naziv.Clear();
        result.setText("0:0");
    }                                       

}
