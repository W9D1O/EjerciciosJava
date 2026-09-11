

package snake;

import java.awt.Color;
import java.awt.Graphics2D;


public class ComidaGraphics {
    private Color color;
    private Comida comida;
    private int scalar;
    
    public ComidaGraphics(Comida comida, Color color, int scalar) {
        this.color = color;
        this.comida = comida;
        this.scalar = scalar;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(comida.getY()* scalar, comida.getY()*scalar, comida.getRadio(),
                    comida.getRadio());
       

        }
    
}
