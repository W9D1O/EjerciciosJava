

package snake;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class PanelJuego extends JPanel{

    private Snake snake;

    public PanelJuego(Snake snake) {
        this.snake = snake;
        setBackground(Color.BLACK);
    }

    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSnake(g);
        // Acá iría el dibujo del snake
    }
    
    private int normalizarCoordenadas(int valor) {
        return valor * 20;
    } 
    
    private void drawSnake(Graphics g) {
        g.setColor(Color.GREEN);
        Vector[] posiciones = snake.getPosiciones();
        snake.mover();
        for (int i = 0; i < posiciones.length; i++) {
            g.fillRect(normalizarCoordenadas(posiciones[i].getX()),
                    normalizarCoordenadas(posiciones[i].getY()),
                    20, 20);


        }

        
    }
}
