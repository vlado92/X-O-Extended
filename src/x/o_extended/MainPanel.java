package x.o_extended;

import javax.swing.JPanel;


public class MainPanel extends JPanel{

    public MainPanel(String name1, String name2, int gameSize) {
        
        int sizeInt = gameSize;
        Fields dugme = new Fields(sizeInt);
        dugme.setVisible(true);
        Options opcije = new Options(dugme, name1, name2);
        opcije.setVisible(true);
        opcije.setAlignmentY(TOP_ALIGNMENT);
        add(dugme);
        add(opcije); 
    }
}
