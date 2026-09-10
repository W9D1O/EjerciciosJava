

package snake;

import java.awt.Color;
import java.awt.Graphics2D;


public class SnakeGraphic {
    private Snake snake;
    private Color color;
    private int scalar;
    
    public SnakeGraphic(Snake snake, Color color, int scalar) {
        this.snake = snake;
        this.color = color;
        this.scalar = scalar;
    }
    
    private int normalizarCoordenadas(int valor) {
        return valor * scalar;
    } 
        
    public void drawSnake(Graphics2D g) {
        g.setColor(Color.GREEN);
        Vector[] posiciones = snake.getPosiciones();
        for (int i = 0; i < posiciones.length; i++) {
            g.fillRect(normalizarCoordenadas(posiciones[i].getX()),
                    normalizarCoordenadas(posiciones[i].getY()),
                    scalar, scalar);


        }
    }
}
