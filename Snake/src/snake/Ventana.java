

package snake;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    private final int SIZE = 20;
    private final int ALTO = 4;
    private final int ANCHO = 3;
    
    
    public Ventana(PanelJuego panel) {
        setTitle("Snake");
        setSize(ALTO*SIZE,ANCHO*SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    
    private void add(PanelJuego panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}