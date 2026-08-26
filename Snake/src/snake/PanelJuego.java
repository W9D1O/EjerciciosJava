

package snake;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class PanelJuego extends JPanel{

    private Snake snake;

    public PanelJuego(Snake snake) {
        this.snake = snake;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Acá iría el dibujo del snake
    }
}
