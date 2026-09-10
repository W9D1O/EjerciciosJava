

package snake;

import java.awt.Color;
import java.awt.Graphics2D;


public class ComidaGraphics {
    private Color color;
    private Comida comida;
    
    public ComidaGraphics(Comida comida, Color color) {
        this.color = color;
        this.comida = comida;
    }
    
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(comida.getY(), comida.getY(), comida.getRadio(),
                    comida.getRadio());
       

        }
    
}
