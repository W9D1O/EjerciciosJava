

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
        g.setColor(color);
        ArrayVector posiciones = snake.getPosiciones();        
        for (int i = 0; i < posiciones.len(); i++) {
            g.fillRect(normalizarCoordenadas(posiciones.getX(i)),
                    normalizarCoordenadas(posiciones.getY(i)),
                    scalar, scalar);


        }
    }
}
